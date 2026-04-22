package com.example.demo.scooter.model;

public class Scooter {
    private Long id;
    private String model;
    private boolean available;

    public Scooter() {}

    public Scooter(Long id, String model, boolean available) {
        this.id = id;
        this.model = model;
        this.available = available;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getModel() { return model; }
    public boolean isAvailable() { return available; }
}
