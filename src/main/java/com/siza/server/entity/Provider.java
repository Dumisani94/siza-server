package com.siza.server.entity;
import jakarta.persistence.*; import lombok.*; import java.time.*; import java.math.*;
@Entity @Table(name="providers") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Provider {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private Long userId;
private String businessName;
private String phoneNumber;
private String bio;
private String status;
private String availability;
private Double averageRating;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
 @PrePersist void create() { createdAt=updatedAt=LocalDateTime.now(); }
 @PreUpdate void update() { updatedAt=LocalDateTime.now(); }
}
