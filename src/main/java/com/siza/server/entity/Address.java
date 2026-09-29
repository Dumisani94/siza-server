package com.siza.server.entity;
import jakarta.persistence.*; import lombok.*; import java.time.*; import java.math.*;
@Entity @Table(name="addresss") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Address {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private Long userId;
private String label;
private String addressLine1;
private String suburb;
private String city;
private String province;
private String postalCode;
private Double latitude;
private Double longitude;
private Boolean defaultAddress;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
 @PrePersist void create() { createdAt=updatedAt=LocalDateTime.now(); }
 @PreUpdate void update() { updatedAt=LocalDateTime.now(); }
}
