package com.siza.dtos;

import com.siza.enums.UserRole;
import com.siza.enums.UserStatus;
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
    private String serviceType;
    private UserStatus status;
    private UserRole role;
    private String cellNumber;
    private String emailAddress;

}
