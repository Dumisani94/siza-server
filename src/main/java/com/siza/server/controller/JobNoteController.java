package com.siza.server.controller;
import com.siza.server.entity.JobNote; import com.siza.server.service.JobNoteService; import org.springframework.http.*; import org.springframework.web.bind.annotation.*; import java.util.*;
@RestController @RequestMapping("/api/job-notes") public class JobNoteController {
 private final JobNoteService service; public JobNoteController(JobNoteService service){this.service=service;}
 @GetMapping public List<JobNote> all(){return service.findAll();}
 @GetMapping("/{id}") public JobNote one(@PathVariable Long id){return service.find(id);}
 @PostMapping public ResponseEntity<JobNote> create(@RequestBody JobNote v){return ResponseEntity.status(HttpStatus.CREATED).body(service.save(v));}
 @PutMapping("/{id}") public JobNote update(@PathVariable Long id,@RequestBody JobNote v){return service.update(id,v);}
 @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id){service.delete(id);return ResponseEntity.noContent().build();}
}
