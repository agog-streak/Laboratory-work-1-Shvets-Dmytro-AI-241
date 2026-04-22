package com.example.demo.scooter.controller;
import com.example.demo.scooter.model.ScooterCategory;
import com.example.demo.scooter.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
class ScooterCategoryController {

    @GetMapping
    public ResponseEntity<List<ScooterCategory>> getAllCategories() {
        List<ScooterCategory> category = List.of(
                new ScooterCategory(1L, "Standard"),
                new ScooterCategory(2L, "Powerful")
        );
        return ResponseEntity.ok(category);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ScooterCategory> getCategory(@PathVariable Long id) {
        return ResponseEntity.ok(new ScooterCategory(id, "Standard"));
    }

    @PostMapping
    public ResponseEntity<ScooterCategory> createCategory() {
        return ResponseEntity.ok(new ScooterCategory(99L, "New Category"));
    }
}
