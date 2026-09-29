package com.siza.server.controller;
import com.siza.server.entity.ProviderSubscription; import com.siza.server.service.ProviderSubscriptionService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/provider-subscriptions") public class ProviderSubscriptionController {
 private final ProviderSubscriptionService service; public ProviderSubscriptionController(ProviderSubscriptionService service){this.service=service;}
 @GetMapping public List<ProviderSubscription> all(){return service.findAll();}
 @GetMapping("/{id}") public ProviderSubscription one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<ProviderSubscription> create(@RequestBody ProviderSubscription v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public ProviderSubscription update(@PathVariable Long id,@RequestBody ProviderSubscription v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
