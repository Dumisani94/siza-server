package com.siza.server.controller;
import com.siza.server.entity.Review; import com.siza.server.service.ReviewService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/reviews") public class ReviewController {
 private final ReviewService service; public ReviewController(ReviewService service){this.service=service;}
 @GetMapping public List<Review> all(){return service.findAll();}
 @GetMapping("/{id}") public Review one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<Review> create(@RequestBody Review v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public Review update(@PathVariable Long id,@RequestBody Review v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
