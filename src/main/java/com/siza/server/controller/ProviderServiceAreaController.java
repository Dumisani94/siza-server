package com.siza.server.controller;
import com.siza.server.entity.ProviderServiceArea; import com.siza.server.service.ProviderServiceAreaService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/provider-service-areas") public class ProviderServiceAreaController {
 private final ProviderServiceAreaService service; public ProviderServiceAreaController(ProviderServiceAreaService service){this.service=service;}
 @GetMapping public List<ProviderServiceArea> all(){return service.findAll();}
 @GetMapping("/{id}") public ProviderServiceArea one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<ProviderServiceArea> create(@RequestBody ProviderServiceArea v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public ProviderServiceArea update(@PathVariable Long id,@RequestBody ProviderServiceArea v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
