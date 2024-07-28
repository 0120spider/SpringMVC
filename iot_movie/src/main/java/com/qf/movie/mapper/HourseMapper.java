package com.qf.movie.mapper;

import com.qf.movie.entity.Hourse;
import com.qf.movie.entity.HourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HourseMapper {
    int countByExample(HourseExample example);

    int deleteByExample(HourseExample example);

    int deleteByPrimaryKey(Integer hourseId);

    int insert(Hourse record);

    int insertSelective(Hourse record);

    List<Hourse> selectByExample(HourseExample example);

    Hourse selectByPrimaryKey(Integer hourseId);

    int updateByExampleSelective(@Param("record") Hourse record, @Param("example") HourseExample example);

    int updateByExample(@Param("record") Hourse record, @Param("example") HourseExample example);

    int updateByPrimaryKeySelective(Hourse record);

    int updateByPrimaryKey(Hourse record);

    List<Hourse> testChar(@Param("hourseid") Integer hourseid);
}