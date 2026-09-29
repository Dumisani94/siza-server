package com.siza.server.service;
import com.siza.server.entity.ProviderServiceArea; import com.siza.server.repository.ProviderServiceAreaRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class ProviderServiceAreaService {
 private final ProviderServiceAreaRepository repo; public ProviderServiceAreaService(ProviderServiceAreaRepository repo){this.repo=repo;}
 public List<ProviderServiceArea> findAll(){return repo.findAll();}
 public ProviderServiceArea find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("ProviderServiceArea not found: "+id));}
 public ProviderServiceArea save(ProviderServiceArea value){return repo.save(value);}
 public ProviderServiceArea update(Long id,ProviderServiceArea value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
