package com.siza.server.service;
import com.siza.server.entity.SubscriptionPlan; import com.siza.server.repository.SubscriptionPlanRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class SubscriptionPlanService {
 private final SubscriptionPlanRepository repo; public SubscriptionPlanService(SubscriptionPlanRepository repo){this.repo=repo;}
 public List<SubscriptionPlan> findAll(){return repo.findAll();}
 public SubscriptionPlan find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("SubscriptionPlan not found: "+id));}
 public SubscriptionPlan save(SubscriptionPlan value){return repo.save(value);}
 public SubscriptionPlan update(Long id,SubscriptionPlan value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
