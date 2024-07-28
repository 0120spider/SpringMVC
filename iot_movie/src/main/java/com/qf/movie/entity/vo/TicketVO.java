package com.qf.movie.entity.vo;

import com.qf.movie.entity.Ticket;
import lombok.Data;


@Data
public class TicketVO extends Ticket {

    private Integer seatType;
}
