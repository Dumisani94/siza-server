package com.siza.server.service;
import com.siza.server.entity.ServiceCategory; import com.siza.server.repository.ServiceCategoryRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class ServiceCategoryService {
 private final ServiceCategoryRepository repo; public ServiceCategoryService(ServiceCategoryRepository repo){this.repo=repo;}
 public List<ServiceCategory> findAll(){return repo.findAll();}
 public ServiceCategory find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("ServiceCategory not found: "+id));}
 public ServiceCategory save(ServiceCategory value){return repo.save(value);}
 public ServiceCategory update(Long id,ServiceCategory value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
