package com.example.demo.scooter.model;

public class Station {
    private Long id;
    private String name;

    public Station() {}

    public Station(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
}
