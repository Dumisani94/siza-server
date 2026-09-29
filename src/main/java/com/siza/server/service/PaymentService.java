package com.siza.server.service;
import com.siza.server.entity.Payment; import com.siza.server.repository.PaymentRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class PaymentService {
 private final PaymentRepository repo; public PaymentService(PaymentRepository repo){this.repo=repo;}
 public List<Payment> findAll(){return repo.findAll();}
 public Payment find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Payment not found: "+id));}
 public Payment save(Payment value){return repo.save(value);}
 public Payment update(Long id,Payment value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
