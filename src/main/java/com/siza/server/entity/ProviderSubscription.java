package com.siza.server.entity;
import jakarta.persistence.*; import lombok.*; import java.time.*; import java.math.*;
@Entity @Table(name="provider_subscriptions") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ProviderSubscription {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private Long providerId;
private Long planId;
private String status;
private Integer jobsUsed;
private java.time.LocalDate startDate;
private java.time.LocalDate endDate;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
 @PrePersist void create() { createdAt=updatedAt=LocalDateTime.now(); }
 @PreUpdate void update() { updatedAt=LocalDateTime.now(); }
}
