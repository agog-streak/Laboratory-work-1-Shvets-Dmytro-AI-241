package com.example.demo.scooter.model;

public class Ride {
    private Long id;
    private String startTime;
    private String endTime;

    public Ride() {}

    public Ride(Long id, String startTime, String endTime) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getStartTime() { return startTime; }
    public String getEndTime() { return endTime; }
}
