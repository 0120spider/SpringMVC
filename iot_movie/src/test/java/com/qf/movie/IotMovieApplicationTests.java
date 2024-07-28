package com.qf.movie;

import com.qf.movie.entity.Hourse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.qf.movie.mapper.HourseMapper;

import java.util.List;

@SpringBootTest
public class IotMovieApplicationTests {

    @Autowired
    private HourseMapper houserMapper;

    /**
     *  添加一个大厅
     */
    @Test
    public void contextLoads() {

        Hourse record = new Hourse();
        record.setHourseName("普通厅2厅");
        houserMapper.insertSelective(record);

        System.out.println(record.getHourseId());
    }

    @Test
    public void test01() {

        List<Hourse> hourses = houserMapper.testChar(4);
        for (Hourse hours : hourses) {
            System.out.println(hours.getHourseName());
        }
    }

}
