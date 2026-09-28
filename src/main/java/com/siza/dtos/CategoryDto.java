package com.siza.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class CategoryDto {

    private Long id;
    private String name;
    private String description;
    private boolean isActive;
    private Date dateCreated;

}
