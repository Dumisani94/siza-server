package com.siza.server.controller;
import com.siza.server.entity.SubscriptionPlan; import com.siza.server.service.SubscriptionPlanService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/subscription-plans") public class SubscriptionPlanController {
 private final SubscriptionPlanService service; public SubscriptionPlanController(SubscriptionPlanService service){this.service=service;}
 @GetMapping public List<SubscriptionPlan> all(){return service.findAll();}
 @GetMapping("/{id}") public SubscriptionPlan one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<SubscriptionPlan> create(@RequestBody SubscriptionPlan v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public SubscriptionPlan update(@PathVariable Long id,@RequestBody SubscriptionPlan v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
