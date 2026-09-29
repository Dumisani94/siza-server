package com.siza.server.repository;
import com.siza.server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface UserRepository extends JpaRepository<User,Long> {
 boolean existsByEmailIgnoreCase(String email);
 boolean existsByPhoneNumber(String phoneNumber);
 List<User> findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String a,String b,String c);
}

