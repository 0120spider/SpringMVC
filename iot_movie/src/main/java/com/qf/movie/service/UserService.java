package com.qf.movie.service;


import com.qf.movie.common.AppException;
import com.qf.movie.entity.TbUser;
import com.qf.movie.entity.TbUserExample;
import com.qf.movie.mapper.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *  和用户有关的业务逻辑层
 *  这里面的一个方法就是和用户有关的一次事务
 */
@Service
public class UserService {
    @Autowired
    private TbUserMapper userMapper;

    public TbUser login(String userName, String userPassword){
        // 1 名字是否存在
        TbUserExample example = new TbUserExample();
        example.createCriteria()
                .andUserNameEqualTo(userName);
        List<TbUser> tbUsers = userMapper.selectByExample(example);
        if(tbUsers==null || tbUsers.size()==0){
            throw new AppException("300","用户名不存在");
        }
        // 2 密码是否正确
        TbUser tbUser = tbUsers.get(0);
        if(userPassword.equals(tbUser.getUserPassword())==false){
            throw new AppException("301","用户名或者密码不正确");
        }

        // 3 return
        return tbUser;
    }
}
