package com.qf.movie.common;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  controller 中的所有异常 都会跑到这个代码中处理
 *  @ControllerAdvice 加上这个注解的类 就是controller 的增强类
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    // 如果抛出的是我们自己的异常 就在下面的方法中处理
    // 参数就是跑出来的异常对象
    @ExceptionHandler(AppException.class)
    @ResponseBody
    public R doAppExceptionHandler(AppException ex){
        System.out.println("有异常发生了："+ex.getCode() + ":" + ex.getMessage());
        return new R(ex.getCode(),ex.getMessage(),null);
    }

    // 统一处理意料之外的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R doExceptionHandler(Exception ex){
        ex.printStackTrace();
        return new R("500","发生未知异常请联系管理员",null);
    }
}
