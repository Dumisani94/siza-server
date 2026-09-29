package com.siza.server.controller;
import com.siza.server.entity.ServiceRequest; import com.siza.server.service.ServiceRequestService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/service-requests") public class ServiceRequestController {
 private final ServiceRequestService service; public ServiceRequestController(ServiceRequestService service){this.service=service;}
 @GetMapping public List<ServiceRequest> all(){return service.findAll();}
 @GetMapping("/{id}") public ServiceRequest one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<ServiceRequest> create(@RequestBody ServiceRequest v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public ServiceRequest update(@PathVariable Long id,@RequestBody ServiceRequest v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
