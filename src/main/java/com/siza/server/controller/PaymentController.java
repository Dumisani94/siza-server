package com.siza.server.controller;
import com.siza.server.entity.Payment; import com.siza.server.service.PaymentService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/payments") public class PaymentController {
 private final PaymentService service; public PaymentController(PaymentService service){this.service=service;}
 @GetMapping public List<Payment> all(){return service.findAll();}
 @GetMapping("/{id}") public Payment one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<Payment> create(@RequestBody Payment v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public Payment update(@PathVariable Long id,@RequestBody Payment v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
