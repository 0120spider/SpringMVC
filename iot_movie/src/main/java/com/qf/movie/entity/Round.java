package com.qf.movie.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
public class Round {
    private Integer roundId;

    private Integer hourseId;

    private Integer movieId;

    private Date roundStart;

    private Date roundEnd;

    private BigDecimal roundPrice;


}