package com.siza.services.impl;

import com.siza.dtos.UsersDto;
import com.siza.mappers.UsersMapper;
import com.siza.persistence.entity.Users;
import com.siza.persistence.repository.UserRepository;
import com.siza.services.UsersService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private final UserRepository userRepository;

    public UsersServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UsersDto> findAllUsers(){
        List<Users> users = userRepository.findAll();
        List<UsersDto> usersDtos = new ArrayList<>();
        if(!users.isEmpty()){
            for (Users user : users) {
                usersDtos.add(UsersMapper.toDto(user));
            }
            return usersDtos;
        }
        return null;
    }
}
