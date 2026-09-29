package com.siza.server.entity;
import jakarta.persistence.*; import lombok.*; import java.time.*; import java.math.*;
@Entity @Table(name="service_requests") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ServiceRequest {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private Long customerId;
private Long categoryId;
private Long addressId;
private Long providerId;
private String description;
private String status;
private java.time.LocalDateTime scheduledFor;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
 @PrePersist void create() { createdAt=updatedAt=LocalDateTime.now(); }
 @PreUpdate void update() { updatedAt=LocalDateTime.now(); }
}
