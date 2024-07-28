package com.qf.movie.entity;

import java.math.BigDecimal;

public class Ticket {
    private Integer ticketId;

    private Integer roundId;

    private Integer movieId;

    private Integer hourseId;

    private BigDecimal roundPrice;

    private Integer seatId;

    private Integer ticketRow;

    private Integer ticketClounm;

    private String ticketStatus;

    private Long version;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Integer getRoundId() {
        return roundId;
    }

    public void setRoundId(Integer roundId) {
        this.roundId = roundId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getHourseId() {
        return hourseId;
    }

    public void setHourseId(Integer hourseId) {
        this.hourseId = hourseId;
    }

    public BigDecimal getRoundPrice() {
        return roundPrice;
    }

    public void setRoundPrice(BigDecimal roundPrice) {
        this.roundPrice = roundPrice;
    }

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getTicketRow() {
        return ticketRow;
    }

    public void setTicketRow(Integer ticketRow) {
        this.ticketRow = ticketRow;
    }

    public Integer getTicketClounm() {
        return ticketClounm;
    }

    public void setTicketClounm(Integer ticketClounm) {
        this.ticketClounm = ticketClounm;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus == null ? null : ticketStatus.trim();
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}