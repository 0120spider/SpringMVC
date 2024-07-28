package com.qf.movie.controller;


import com.qf.movie.common.R;
import com.qf.movie.entity.vo.RoundVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Calendar;
import java.util.Date;

@Controller
@RequestMapping("/test")
@CrossOrigin
public class TestController {


    @RequestMapping("/date")   //  /test/date
    @ResponseBody
    public R testDate(){

//        RoundVO vo = new RoundVO();
//        vo.setName("zkx");
//        vo.setStart(new Date());
        return new R("200","成功",null);
    }
}
