package com.siza.server.service;
import com.siza.server.entity.ServiceRequest; import com.siza.server.repository.ServiceRequestRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class ServiceRequestService {
 private final ServiceRequestRepository repo; public ServiceRequestService(ServiceRequestRepository repo){this.repo=repo;}
 public List<ServiceRequest> findAll(){return repo.findAll();}
 public ServiceRequest find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("ServiceRequest not found: "+id));}
 public ServiceRequest save(ServiceRequest value){return repo.save(value);}
 public ServiceRequest update(Long id,ServiceRequest value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
