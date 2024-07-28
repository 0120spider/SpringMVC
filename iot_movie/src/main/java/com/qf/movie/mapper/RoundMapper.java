package com.qf.movie.mapper;

import com.qf.movie.entity.Round;
import com.qf.movie.entity.RoundExample;

import java.util.Date;
import java.util.List;

import com.qf.movie.entity.vo.RoundVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface RoundMapper {
    int countByExample(RoundExample example);

    int deleteByExample(RoundExample example);

    int deleteByPrimaryKey(Integer roundId);

    int insert(Round record);

    int insertSelective(Round record);

    List<Round> selectByExample(RoundExample example);

    Round selectByPrimaryKey(Integer roundId);

    int updateByExampleSelective(@Param("record") Round record, @Param("example") RoundExample example);

    int updateByExample(@Param("record") Round record, @Param("example") RoundExample example);

    int updateByPrimaryKeySelective(Round record);

    int updateByPrimaryKey(Round record);

    List<Round> selectClashRounds(
            @Param("hourseid") Integer hourseid,
            @Param("start") Date start,
            @Param("end") Date end
            );

    List<RoundVO> selectRoundsByMovieIdAndDate(@Param("movieId") Integer movieId,@Param("date") Date date);
}