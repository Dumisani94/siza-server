package com.siza.server.controller;

import com.siza.server.dto.UserRequest;
import com.siza.server.entity.User;
import com.siza.server.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> create(@Valid @RequestBody UserRequest r) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(r));
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        return service.get(id);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @Valid @RequestBody UserRequest r) {
        return service.update(id, r);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public List<User> search(@RequestParam(defaultValue = "") String q) {
        return service.search(q);
    }

    @GetMapping("/all")
    public List<User> allUsers() {
        return service.findAll();
    }


    @GetMapping("/count")
    public Map<String, Long> count() {
        return Map.of("count", service.count());
    }
}
