package com.qf.movie.controller;


import com.qf.movie.common.R;
import com.qf.movie.entity.TbUser;
import com.qf.movie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  专门处理用户相关请求的接口层
 */
@Controller
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")   // /user/login
    @ResponseBody
    public R login(String userName, String userPassword){
        TbUser user = userService.login(userName, userPassword);
        return new R("200","登陆成功",user);
    }
}
