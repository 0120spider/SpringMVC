package com.qf.movie.entity.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderDTO {

    private Long userId;
    private Integer roundId;
    private List<Integer> selTickets;
}