package com.siza.server.service;
import com.siza.server.entity.Quote; import com.siza.server.repository.QuoteRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class QuoteService {
 private final QuoteRepository repo; public QuoteService(QuoteRepository repo){this.repo=repo;}
 public List<Quote> findAll(){return repo.findAll();}
 public Quote find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Quote not found: "+id));}
 public Quote save(Quote value){return repo.save(value);}
 public Quote update(Long id,Quote value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
