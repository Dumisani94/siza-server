package com.siza.server.controller;
import com.siza.server.entity.Provider; import com.siza.server.service.ProviderService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/providers") public class ProviderController {
 private final ProviderService service; public ProviderController(ProviderService service){this.service=service;}
 @GetMapping public List<Provider> all(){return service.findAll();}
 @GetMapping("/{id}") public Provider one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<Provider> create(@RequestBody Provider v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public Provider update(@PathVariable Long id,@RequestBody Provider v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
