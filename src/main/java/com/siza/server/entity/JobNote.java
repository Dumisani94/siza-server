package com.siza.server.entity;
import jakarta.persistence.*; import lombok.*; import java.time.*; import java.math.*;
@Entity @Table(name="job_notes") @Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class JobNote {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private Long serviceRequestId;
private Long userId;
private String note;
 private LocalDateTime createdAt;
 private LocalDateTime updatedAt;
 @PrePersist void create() { createdAt=updatedAt=LocalDateTime.now(); }
 @PreUpdate void update() { updatedAt=LocalDateTime.now(); }
}
