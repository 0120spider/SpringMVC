package com.qf.movie.service;


import com.qf.movie.common.AppException;
import com.qf.movie.common.IDUtils;
import com.qf.movie.entity.*;
import com.qf.movie.entity.dto.OrderDTO;
import com.qf.movie.entity.vo.RoundVO;
import com.qf.movie.entity.vo.TicketVO;
import com.qf.movie.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *  和电影有关的业务都在这里
 */
@Service
public class MovieService {

    @Autowired
    private MovieMapper movieMapper;
    @Autowired
    private HourseMapper hourseMapper;
    @Autowired
    private RoundMapper roundMapper;
    @Autowired
    private SeatMapper seatMapper;
    @Autowired
    private TicketMapper ticketMapper;
    @Autowired
    private TbOrderMapper orderMapper;

    private IDUtils idUtils=new IDUtils();


    /**
     *  添加一个电影
     */
    public void addMovie(Movie movie){
        movieMapper.insertSelective(movie);
    }

    /**
     *  查询所有的还没有下架的电影
     */
    public List<Movie> getAllActiveMovie(){
        // 1 获得当前时间
        Date now = new Date();
        // 2 查询出 下架时间大于当前时间的电影
        MovieExample example = new MovieExample();
        example.createCriteria()
                .andMovieEndGreaterThan(now);
        List<Movie> movies = movieMapper.selectByExample(example);
        return movies;
    }
    public List<Hourse> getAllHourse(){
        List<Hourse> hourses = hourseMapper.selectByExample(null);
        return hourses;
    }
    @Transactional
    public void addRound(Round round){
        Movie movie = movieMapper.selectByPrimaryKey(round.getMovieId());
        Integer movieLength = movie.getMovieLength();
        Date roundStart = round.getRoundStart();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(roundStart);
        calendar.add(Calendar.SECOND,movieLength);
        Date roundEnd = calendar.getTime();
        MovieExample example = new MovieExample();
        example.createCriteria()
                .andMovieIdEqualTo(round.getMovieId())
                .andMovieStartLessThan(roundStart)
                .andMovieEndGreaterThan(roundStart);
        List<Movie> movies = movieMapper.selectByExample(example);
        if(movies==null || movies.size()==0){
            throw new AppException("400","请在指定的的时间内添加场次");
        }

        // 3 判断同一个大厅会不会有时间冲突的场次
        List<Round> rounds = roundMapper.selectClashRounds(round.getHourseId(), roundStart, roundEnd);
        if(rounds!=null && rounds.size()>0){
            throw new AppException("401","指定的会议厅内 有场次冲突");
        }

        // 4 添加场次
        round.setRoundEnd(roundEnd);
        int i = roundMapper.insertSelective(round);
        if(i==0){
            throw new AppException("402","添加场次失败");
        }

        // 5 添加票
        // 5.1 查询出这个大厅的座位
        SeatExample seatExample = new SeatExample();
        seatExample.createCriteria()
                .andHourseIdEqualTo(round.getHourseId());
        List<Seat> seats = seatMapper.selectByExample(seatExample);
        // 5.2 有一个座位就去添加一场票
        for (Seat seat : seats) {

            Ticket ticket = new Ticket();
            ticket.setHourseId(round.getHourseId());
            ticket.setMovieId(round.getMovieId());
            ticket.setRoundPrice(round.getRoundPrice());
            ticket.setSeatId(seat.getSeatId());
            ticket.setTicketClounm(seat.getSeatClounm());
            ticket.setTicketRow(seat.getSeatRow());
            ticket.setTicketStatus("0");  //0  没有被抢占  // 1 被抢了
            ticket.setVersion(1L);
            ticket.setRoundId(round.getRoundId());
            int count = ticketMapper.insertSelective(ticket);
            if(count==0){
                throw new AppException("403","添加失败");
            }

        }
    }


    /**
     *  根据电影的id 和 指定时间 查询场次的集合
     */
    public List<RoundVO> selectRoundsByMovieIdAndDate(Integer movieId,Date date){
        List<RoundVO> roundVOS = roundMapper.selectRoundsByMovieIdAndDate(movieId, date);
        if(roundVOS==null || roundVOS.size()==0){
            throw new AppException("404","您指定的日期相关会议的场次");
        }
        return roundVOS;
    }

    /**
     *  根据场次id 查询出这一场的票的情况
     */
    public List<TicketVO> getTicketsByRoundId(Integer roundid){
        List<TicketVO> ticketVOS = ticketMapper.selTicketByRoundid(roundid);
        return ticketVOS;
    }

    /**
     *  根据用户的选择的位置添加订单 并且改变座位的状态
     */
    @Transactional
    public void addOrder(OrderDTO dto){


        // 1 查询一下这个场次是否已经开始了
        Date now = new Date();
        Round round = roundMapper.selectByPrimaryKey(dto.getRoundId());

        // 这一场的电影的单间
        BigDecimal roundPrice = round.getRoundPrice();
        // 这一场电影的sum
        BigDecimal sum = roundPrice.multiply(new BigDecimal(dto.getSelTickets().size()));
        if(round.getRoundStart().compareTo(now)<0){
            throw new AppException("410","会议已经开场");
        }
        // 2 查询我要买的票 没有被别人买了
        // 3 修改票状态
        for (Integer ticketid : dto.getSelTickets()) {
            Ticket ticket = ticketMapper.selectByPrimaryKey(ticketid);
            if("1".equals(ticket.getTicketStatus())){
                throw new AppException("411","位置被占了");
            }
            // 修改票的状态
            ticket.setTicketStatus("1");
            int i = ticketMapper.updateByPrimaryKeySelective(ticket);
            if(i==0){
                throw new AppException("412","抢座失败");
            }
        }


        // 4 添加订单
        TbOrder order = new TbOrder();
        order.setCreateTime(now);
        order.setOrderStatus("0");   // 0 未支付
        order.setUserId(dto.getUserId());
        order.setOrderPrice(sum);
        order.setOrderId(idUtils.nextId());
        int i = orderMapper.insertSelective(order);
        if(i==0){
            throw new AppException("413","失败");
        }

    }
    /**
     *  根据usreid 和 状态 查询用户的订单
     */
    public List<TbOrder> getOrdersByUserIdAndStatus(Long userId,String status) {

        TbOrderExample example = new TbOrderExample();
        TbOrderExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(userId);
        if ("0".equals(status) == true || "1".equals(status) == true) {
            criteria.andOrderStatusEqualTo(status);
        }
        List<TbOrder> tbOrders = orderMapper.selectByExample(example);
        if (tbOrders == null || tbOrders.size() == 0) {
            throw new AppException("600", "没有查到");
        }
        return  tbOrders;
    }
}
