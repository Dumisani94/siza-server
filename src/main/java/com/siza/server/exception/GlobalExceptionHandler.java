package com.siza.server.exception;
import org.springframework.http.*;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestControllerAdvice
public class GlobalExceptionHandler {
 @ExceptionHandler(ResourceNotFoundException.class)
 ResponseEntity<Map<String,String>> notFound(ResourceNotFoundException ex){return ResponseEntity.status(404).body(Map.of("message",ex.getMessage()));}
 @ExceptionHandler(IllegalArgumentException.class)
 ResponseEntity<Map<String,String>> badRequest(IllegalArgumentException ex){return ResponseEntity.badRequest().body(Map.of("message",ex.getMessage()));}
 @ExceptionHandler(MethodArgumentNotValidException.class)
 ResponseEntity<Map<String,String>> validation(MethodArgumentNotValidException ex){
   Map<String,String> e=new LinkedHashMap<>(); ex.getBindingResult().getFieldErrors().forEach(x->e.put(x.getField(),x.getDefaultMessage())); return ResponseEntity.badRequest().body(e);
 }
}
