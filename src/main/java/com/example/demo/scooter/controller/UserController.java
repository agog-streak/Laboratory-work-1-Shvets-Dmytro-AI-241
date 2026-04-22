package com.example.demo.scooter.controller;
import com.example.demo.scooter.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
class UserController {
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(new User(id, "Dima", "test@mail.com"));
    }
    @PostMapping
    public ResponseEntity<User> createUser() {
        return ResponseEntity.ok(new User(1L, "Dima", "test@mail.com"));
    }
    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = List.of(
                new User(1L, "Dima", "dima@mail.com"),
                new User(2L, "Ivan", "ivan@mail.com")
        );
        return ResponseEntity.ok(users);
    }
}