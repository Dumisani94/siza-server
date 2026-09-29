package com.siza.server.service;
import com.siza.server.entity.Notification; import com.siza.server.repository.NotificationRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class NotificationService {
 private final NotificationRepository repo; public NotificationService(NotificationRepository repo){this.repo=repo;}
 public List<Notification> findAll(){return repo.findAll();}
 public Notification find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Notification not found: "+id));}
 public Notification save(Notification value){return repo.save(value);}
 public Notification update(Long id,Notification value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
