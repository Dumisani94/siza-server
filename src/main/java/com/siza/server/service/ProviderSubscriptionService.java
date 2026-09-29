package com.siza.server.service;
import com.siza.server.entity.ProviderSubscription; import com.siza.server.repository.ProviderSubscriptionRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class ProviderSubscriptionService {
 private final ProviderSubscriptionRepository repo; public ProviderSubscriptionService(ProviderSubscriptionRepository repo){this.repo=repo;}
 public List<ProviderSubscription> findAll(){return repo.findAll();}
 public ProviderSubscription find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("ProviderSubscription not found: "+id));}
 public ProviderSubscription save(ProviderSubscription value){return repo.save(value);}
 public ProviderSubscription update(Long id,ProviderSubscription value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
