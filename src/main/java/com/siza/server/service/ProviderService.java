package com.siza.server.service;
import com.siza.server.entity.Provider; import com.siza.server.repository.ProviderRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class ProviderService {
 private final ProviderRepository repo; public ProviderService(ProviderRepository repo){this.repo=repo;}
 public List<Provider> findAll(){return repo.findAll();}
 public Provider find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Provider not found: "+id));}
 public Provider save(Provider value){return repo.save(value);}
 public Provider update(Long id,Provider value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
