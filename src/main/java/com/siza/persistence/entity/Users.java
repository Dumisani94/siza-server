package com.siza.persistence.entity;

import com.siza.enums.UserRole;
import com.siza.enums.UserStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "users")
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String surname;
    private String password;
    private Date createdAt;
    private String idNumber;
    private String serviceType;
    private UserStatus status;
    private UserRole role;
    private String cellNumber;
    private String emailAddress;
}
