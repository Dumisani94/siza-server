package com.siza.server.service;
import com.siza.server.entity.Address; import com.siza.server.repository.AddressRepository; import com.siza.server.exception.ResourceNotFoundException; import org.springframework.stereotype.Service; import java.util.*;
@Service public class AddressService {
 private final AddressRepository repo; public AddressService(AddressRepository repo){this.repo=repo;}
 public List<Address> findAll(){return repo.findAll();}
 public Address find(Long id){return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Address not found: "+id));}
 public Address save(Address value){return repo.save(value);}
 public Address update(Long id,Address value){ value.setId(id); find(id); return repo.save(value);}
 public void delete(Long id){repo.delete(find(id));}
}
