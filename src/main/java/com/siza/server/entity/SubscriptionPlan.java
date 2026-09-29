package com.siza.server.entity;
import jakarta.persistence.*; import lombok.*; import java.time.*; import java.math.*;
@Entity @Table(name="subscription_plans") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class SubscriptionPlan {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private String name;
private java.math.BigDecimal monthlyPrice;
private Integer freeJobLimit;
private Boolean active;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
 @PrePersist void create() { createdAt=updatedAt=LocalDateTime.now(); }
 @PreUpdate void update() { updatedAt=LocalDateTime.now(); }
}
