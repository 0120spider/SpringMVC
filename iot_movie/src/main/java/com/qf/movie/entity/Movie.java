package com.qf.movie.entity;

import lombok.Data;

import java.util.Date;


@Data
public class Movie {
    private Integer movieId;

    private String movieName;

    private String moviePic;

    private Date movieStart;

    private Date movieEnd;

    private Integer movieLength;


}