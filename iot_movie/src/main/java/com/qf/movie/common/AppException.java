package com.qf.movie.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  业务异常类
 *  这里的异常都是和我们的业务相关的
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppException extends RuntimeException{

    private String code;
    private String message;
}
