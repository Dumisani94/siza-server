package com.siza.server.controller;
import com.siza.server.entity.ProviderCategory; import com.siza.server.service.ProviderCategoryService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/provider-categorys") public class ProviderCategoryController {
 private final ProviderCategoryService service; public ProviderCategoryController(ProviderCategoryService service){this.service=service;}
 @GetMapping public List<ProviderCategory> all(){return service.findAll();}
 @GetMapping("/{id}") public ProviderCategory one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<ProviderCategory> create(@RequestBody ProviderCategory v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public ProviderCategory update(@PathVariable Long id,@RequestBody ProviderCategory v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
