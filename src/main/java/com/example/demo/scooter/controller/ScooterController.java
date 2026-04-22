package com.example.demo.scooter.controller;
import com.example.demo.scooter.model.Scooter;
import com.example.demo.scooter.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scooters")
class ScooterController {
    @GetMapping
    public ResponseEntity<List<Scooter>> getAllScooters() {
        List<Scooter> scooter = List.of(
                new Scooter(1L, "Xiaomi", true),
                new Scooter(2L, "Ninebot", false)
        );
        return ResponseEntity.ok(scooter);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Scooter> getScooter(@PathVariable Long id) {
        return ResponseEntity.ok(new Scooter(id, "Xiaomi", true));
    }

    @PostMapping
    public ResponseEntity<Scooter> createScooter() {
        return ResponseEntity.ok(new Scooter(99L, "New Scooter", true));
    }
}