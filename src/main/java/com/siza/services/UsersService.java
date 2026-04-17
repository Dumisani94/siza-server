package com.siza.services;

import com.siza.dtos.UsersDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersService {

    List<UsersDto> findAllUsers();

}
