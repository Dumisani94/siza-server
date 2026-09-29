package com.siza.server.controller;
import com.siza.server.entity.ServiceCategory; import com.siza.server.service.ServiceCategoryService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/service-categorys") public class ServiceCategoryController {
 private final ServiceCategoryService service; public ServiceCategoryController(ServiceCategoryService service){this.service=service;}
 @GetMapping public List<ServiceCategory> all(){return service.findAll();}
 @GetMapping("/{id}") public ServiceCategory one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<ServiceCategory> create(@RequestBody ServiceCategory v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public ServiceCategory update(@PathVariable Long id,@RequestBody ServiceCategory v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
