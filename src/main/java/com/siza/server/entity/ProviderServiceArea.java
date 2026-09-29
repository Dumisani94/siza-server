package com.siza.server.entity;
import jakarta.persistence.*; import lombok.*; import java.time.*; import java.math.*;
@Entity @Table(name="provider_service_areas") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ProviderServiceArea {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private Long providerId;
private String areaName;
private Double latitude;
private Double longitude;
private Double radiusKm;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
 @PrePersist void create() { createdAt=updatedAt=LocalDateTime.now(); }
 @PreUpdate void update() { updatedAt=LocalDateTime.now(); }
}
