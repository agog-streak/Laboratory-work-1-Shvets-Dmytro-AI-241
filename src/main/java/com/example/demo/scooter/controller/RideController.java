package com.example.demo.scooter.controller;
import com.example.demo.scooter.model.Ride;
import com.example.demo.scooter.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rides")
class RideController {
    @GetMapping
    public ResponseEntity<List<Ride>> getAllRides() {
        List<Ride> ride = List.of(
                new Ride(1L, "10:00", "10:30"),
                new Ride(2L, "11:00", "11:20")
        );
        return ResponseEntity.ok(ride);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ride> getRide(@PathVariable Long id) {
        return ResponseEntity.ok(new Ride(id, "10:00", "10:30"));
    }

    @PostMapping
    public ResponseEntity<Ride> createRide() {
        return ResponseEntity.ok(new Ride(99L, "12:00", "12:30"));
    }
}
