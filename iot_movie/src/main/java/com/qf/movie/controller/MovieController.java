package com.qf.movie.controller;


import com.qf.movie.common.R;
import com.qf.movie.entity.Hourse;
import com.qf.movie.entity.Movie;
import com.qf.movie.entity.Round;
import com.qf.movie.entity.TbOrder;
import com.qf.movie.entity.dto.OrderDTO;
import com.qf.movie.entity.vo.RoundVO;
import com.qf.movie.entity.vo.TicketVO;
import com.qf.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/movie")
@CrossOrigin
public class MovieController {

    @Autowired
    private MovieService movieService;

    /**
     *  添加电影的接口
     */
    @RequestMapping("/add")
    @ResponseBody
    public R addMovie(Movie movie){
        System.out.println(movie);
        movieService.addMovie(movie);
        return new R("200","添加成功",null);
    }

    /**
     *  获得所有的未下架的电影的集合
     */
    @RequestMapping("/allactivemovie")   //  /movie/allactivemovie
    @ResponseBody
    public R allactivemovie(){

        List<Movie> allActiveMovie = movieService.getAllActiveMovie();
        return new R("200","成功",allActiveMovie);
    }


    /**
     *  获得所有的大厅的集合
     */
    @RequestMapping("/allhourse")   //  /movie/allactivemovie
    @ResponseBody
    public R allhourse(){

        List<Hourse> allHourse = movieService.getAllHourse();
        return new R("200","成功",allHourse);
    }

    /**
     *  添加一个场次的接口
     */
    @RequestMapping("/addround")
    @ResponseBody
    public R addRound(Round round){
        System.out.println(round);
        // 调用业务逻辑层
        movieService.addRound(round);
        return new R("200","成功",null);
    }

    /**
     *  根据用户选择的电影id 以及播放的时间 查询场次的集合
     */
    @RequestMapping("/selround")
    @ResponseBody
    public R selround(Integer movieId, Date date){
        List<RoundVO> roundVOS = movieService.selectRoundsByMovieIdAndDate(movieId, date);
        return new R("200","成功",roundVOS);
    }

    @RequestMapping("/ticket/{roundid}")
    @ResponseBody
    public R getTicketsByRoundid(@PathVariable("roundid") Integer roundid){
        System.out.println("要查询的会议是："+roundid);
        List<TicketVO> tickets = movieService.getTicketsByRoundId(roundid);
        return new R("200","成功",tickets);
    }

    /**
     *  勾选位置 添加订单的方法
     */
    @RequestMapping("/addorder")
    @ResponseBody
    public R addOrder(OrderDTO dto){
        System.out.println(dto);
        movieService.addOrder(dto);

        return new R("200","成功",null);
    }

    /**
     *  根据userid 和 状态 获得订单的集合
     */
    @RequestMapping("/myorders")
    @ResponseBody
    public R getOrdersByUseridAndStatus(Long userId,String status){
        List<TbOrder> orders = movieService.getOrdersByUserIdAndStatus(userId, status);

        return new R("200","成功",orders);
    }

}
