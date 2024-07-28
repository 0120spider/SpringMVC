package com.qf.movie;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qf.movie.mapper")
public class IotMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(IotMovieApplication.class, args);
    }

}
