package com.siza.controllers;


import com.siza.dtos.UsersDto;
import com.siza.services.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/users")
public class UsersControllers {

    private final UsersService usersService;

    public UsersControllers(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/all")
    public List<UsersDto> all(){
        return usersService.findAllUsers();
    }
}
