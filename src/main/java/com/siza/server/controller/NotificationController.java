package com.siza.server.controller;
import com.siza.server.entity.Notification; import com.siza.server.service.NotificationService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/notifications") public class NotificationController {
 private final NotificationService service; public NotificationController(NotificationService service){this.service=service;}
 @GetMapping public List<Notification> all(){return service.findAll();}
 @GetMapping("/{id}") public Notification one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<Notification> create(@RequestBody Notification v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public Notification update(@PathVariable Long id,@RequestBody Notification v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
