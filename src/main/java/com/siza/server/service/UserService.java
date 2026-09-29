package com.siza.server.service;

import com.siza.server.dto.UserRequest;
import com.siza.server.entity.User;
import com.siza.server.exception.ResourceNotFoundException;
import com.siza.server.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User create(UserRequest r) {
        if (repo.existsByEmailIgnoreCase(r.email())) throw new IllegalArgumentException("Email already exists");
        if (repo.existsByPhoneNumber(r.phoneNumber()))
            throw new IllegalArgumentException("Phone number already exists");
        return repo.save(User.builder().firstName(r.firstName()).lastName(r.lastName()).email(r.email()).phoneNumber(r.phoneNumber()).role(r.role() == null || r.role().isBlank() ? "CUSTOMER" : r.role()).build());
    }

    @Transactional(readOnly = true)
    public User get(Long id) {
        return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found: " + id));
    }

    public User update(Long id, UserRequest r) {
        User u = get(id);
        u.setFirstName(r.firstName());
        u.setLastName(r.lastName());
        u.setEmail(r.email());
        u.setPhoneNumber(r.phoneNumber());
        if (r.role() != null && !r.role().isBlank()) u.setRole(r.role());
        return repo.save(u);
    }

    public void delete(Long id) {
        repo.delete(get(id));
    }

    public List<User> findAll(){
        return repo.findAll();
    }

    @Transactional(readOnly = true)
    public List<User> search(String q) {
        return repo.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCaseOrEmailContainingIgnoreCase(q, q, q);
    }

    @Transactional(readOnly = true)
    public long count() {
        return repo.count();
    }
}
