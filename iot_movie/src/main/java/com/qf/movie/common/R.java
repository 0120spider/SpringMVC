package com.qf.movie.common;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  统一返回的对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {

    private String code;  // 200 成功  200以外失败
    private String message;
    private Object data;
}
