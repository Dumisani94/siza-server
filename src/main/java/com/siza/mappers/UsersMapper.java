package com.siza.mappers;

import com.siza.dtos.UsersDto;
import com.siza.persistence.entity.Users;

public class UsersMapper {

    public static UsersDto toDto(Users users){
        UsersDto usersDto = new UsersDto();
        if(users != null){
            usersDto.setId(users.getId());
            usersDto.setName(users.getName());
            usersDto.setSurname(users.getSurname());
            usersDto.setPassword(users.getPassword());
            usersDto.setIdNumber(users.getIdNumber());
            usersDto.setCreatedAt(users.getCreatedAt());
            usersDto.setEmailAddress(users.getEmailAddress());
            usersDto.setCellNumber(users.getCellNumber());
            usersDto.setStatus(users.getStatus());
            usersDto.setServiceType(users.getServiceType());
            usersDto.setRole(users.getRole());
        }
        return usersDto;
    }
}
