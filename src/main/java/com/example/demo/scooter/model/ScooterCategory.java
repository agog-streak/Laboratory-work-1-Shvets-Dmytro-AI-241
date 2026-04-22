package com.example.demo.scooter.model;

public class ScooterCategory {
    private Long id;
    private String type;

    public ScooterCategory() {}

    public ScooterCategory(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getType() { return type; }
}

