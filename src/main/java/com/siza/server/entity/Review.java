package com.siza.server.entity;
import jakarta.persistence.*; import lombok.*; import java.time.*; import java.math.*;
@Entity @Table(name="reviews") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Review {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private Long serviceRequestId;
private Long customerId;
private Long providerId;
private Integer rating;
private String comment;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
 @PrePersist void create() { createdAt=updatedAt=LocalDateTime.now(); }
 @PreUpdate void update() { updatedAt=LocalDateTime.now(); }
}
