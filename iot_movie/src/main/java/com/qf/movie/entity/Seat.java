package com.qf.movie.entity;

public class Seat {
    private Integer seatId;

    private Integer hourseId;

    private Integer seatRow;

    private Integer seatClounm;

    private Integer seatType;

    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    public Integer getHourseId() {
        return hourseId;
    }

    public void setHourseId(Integer hourseId) {
        this.hourseId = hourseId;
    }

    public Integer getSeatRow() {
        return seatRow;
    }

    public void setSeatRow(Integer seatRow) {
        this.seatRow = seatRow;
    }

    public Integer getSeatClounm() {
        return seatClounm;
    }

    public void setSeatClounm(Integer seatClounm) {
        this.seatClounm = seatClounm;
    }

    public Integer getSeatType() {
        return seatType;
    }

    public void setSeatType(Integer seatType) {
        this.seatType = seatType;
    }
}