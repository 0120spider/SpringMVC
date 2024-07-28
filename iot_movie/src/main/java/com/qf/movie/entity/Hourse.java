package com.qf.movie.entity;

public class Hourse {
    private Integer hourseId;

    private String hourseName;

    public Integer getHourseId() {
        return hourseId;
    }

    public void setHourseId(Integer hourseId) {
        this.hourseId = hourseId;
    }

    public String getHourseName() {
        return hourseName;
    }

    public void setHourseName(String hourseName) {
        this.hourseName = hourseName == null ? null : hourseName.trim();
    }
}