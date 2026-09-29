package com.siza.server.service;
import com.siza.server.entity.ProviderCategory; import com.siza.server.repository.ProviderCategoryRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class ProviderCategoryService {
 private final ProviderCategoryRepository repo; public ProviderCategoryService(ProviderCategoryRepository repo){this.repo=repo;}
 public List<ProviderCategory> findAll(){return repo.findAll();}
 public ProviderCategory find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("ProviderCategory not found: "+id));}
 public ProviderCategory save(ProviderCategory value){return repo.save(value);}
 public ProviderCategory update(Long id,ProviderCategory value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
