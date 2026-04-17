package com.siza.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class UsersDto {

    private String id;
    private String name;
    private String surname;
    private String password;
    private Date createdAt;
    private String idNumber;

}
