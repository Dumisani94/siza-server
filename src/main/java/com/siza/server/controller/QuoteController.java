package com.siza.server.controller;
import com.siza.server.entity.Quote; import com.siza.server.service.QuoteService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/quotes") public class QuoteController {
 private final QuoteService service; public QuoteController(QuoteService service){this.service=service;}
 @GetMapping public List<Quote> all(){return service.findAll();}
 @GetMapping("/{id}") public Quote one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<Quote> create(@RequestBody Quote v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public Quote update(@PathVariable Long id,@RequestBody Quote v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
