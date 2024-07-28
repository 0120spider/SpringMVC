package com.qf.movie.mapper;

import com.qf.movie.entity.Ticket;
import com.qf.movie.entity.TicketExample;
import java.util.List;

import com.qf.movie.entity.vo.TicketVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketMapper {
    int countByExample(TicketExample example);

    int deleteByExample(TicketExample example);

    int deleteByPrimaryKey(Integer ticketId);

    int insert(Ticket record);

    int insertSelective(Ticket record);

    List<Ticket> selectByExample(TicketExample example);

    Ticket selectByPrimaryKey(Integer ticketId);

    int updateByExampleSelective(@Param("record") Ticket record, @Param("example") TicketExample example);

    int updateByExample(@Param("record") Ticket record, @Param("example") TicketExample example);

    int updateByPrimaryKeySelective(Ticket record);

    int updateByPrimaryKey(Ticket record);

    /**
     *  根据场次id 查询这一场的票的信息
     */
    List<TicketVO> selTicketByRoundid(@Param("roundId") Integer roundId);
}