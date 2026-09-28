package com.siza.mappers;

import com.siza.dtos.CategoryDto;
import com.siza.persistence.entity.Category;

public class CategoryMapper {

    public static CategoryDto toDto(Category category){
        CategoryDto categoryDto = new CategoryDto();
        if(category != null){
            categoryDto.setName( category.getName());
            categoryDto.setActive( category.isActive());
            categoryDto.setDateCreated( category.getDateCreated());
            categoryDto.setDescription( category.getDescription());
            categoryDto.setId( category.getId());
        }
        return categoryDto;
    }
}
