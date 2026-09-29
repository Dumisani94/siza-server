package com.siza.server.service;
import com.siza.server.entity.JobNote; import com.siza.server.repository.JobNoteRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class JobNoteService {
 private final JobNoteRepository repo; public JobNoteService(JobNoteRepository repo){this.repo=repo;}
 public List<JobNote> findAll(){return repo.findAll();}
 public JobNote find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("JobNote not found: "+id));}
 public JobNote save(JobNote value){return repo.save(value);}
 public JobNote update(Long id,JobNote value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
