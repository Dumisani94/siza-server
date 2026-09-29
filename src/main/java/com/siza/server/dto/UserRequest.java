package com.siza.server.dto;
import jakarta.validation.constraints.*;
public record UserRequest(
 @NotBlank String firstName,
 @NotBlank String lastName,
 @NotBlank @Email String email,
 @NotBlank String phoneNumber,
 String role) {}
