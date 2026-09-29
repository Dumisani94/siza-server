package com.siza.server.entity;
import jakarta.persistence.*; import lombok.*; import java.time.*; import java.math.*;
@Entity @Table(name="provider_categorys") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ProviderCategory {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private Long providerId;
private Long categoryId;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
 @PrePersist void create() { createdAt=updatedAt=LocalDateTime.now(); }
 @PreUpdate void update() { updatedAt=LocalDateTime.now(); }
}
