package com.example.demo.scooter.controller;
import com.example.demo.scooter.model.Scooter;
import com.example.demo.scooter.model.Station;
import com.example.demo.scooter.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stations")
class StationController {
    @GetMapping
    public ResponseEntity<List<Station>> getAllStations() {
        List<Station> station = List.of(
                new Station(1L, "Center"),
                new Station(2L, "Park")
        );
        return ResponseEntity.ok(station);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Station> getStation(@PathVariable Long id) {
        return ResponseEntity.ok(new Station(id, "Center"));
    }

    @PostMapping
    public ResponseEntity<Station> createStation() {
        return ResponseEntity.ok(new Station(99L, "New Station"));
    }
}


