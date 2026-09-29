package com.siza.server.service;
import com.siza.server.entity.Review; import com.siza.server.repository.ReviewRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class ReviewService {
 private final ReviewRepository repo; public ReviewService(ReviewRepository repo){this.repo=repo;}
 public List<Review> findAll(){return repo.findAll();}
 public Review find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Review not found: "+id));}
 public Review save(Review value){return repo.save(value);}
 public Review update(Long id,Review value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
