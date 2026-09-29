package com.siza.server.entity;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name="users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private UUID id;
    @Column(nullable=false) private String firstName;
    @Column(nullable=false) private String lastName;
    @Column(nullable=false, unique=true) private String email;
    @Column(nullable=false, unique=true) private String phoneNumber;
    @Column(nullable=false) private String role;
    @Column(nullable=false) private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    @PrePersist void prePersist(){ createdAt=LocalDateTime.now(); if(role==null) role="CUSTOMER"; }
    @PreUpdate void preUpdate(){ updatedAt=LocalDateTime.now(); }
}
