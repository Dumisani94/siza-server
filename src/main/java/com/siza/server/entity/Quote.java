package com.siza.server.entity;
import jakarta.persistence.*; import lombok.*; import java.time.*; import java.math.*;
@Entity @Table(name="quotes") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Quote {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private Long serviceRequestId;
private Long providerId;
private java.math.BigDecimal amount;
private String description;
private String status;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
 @PrePersist void create() { createdAt=updatedAt=LocalDateTime.now(); }
 @PreUpdate void update() { updatedAt=LocalDateTime.now(); }
}
