package com.siza.controllers;

import com.siza.dtos.CategoryDto;
import com.siza.services.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/all/categories")
    public List<CategoryDto> all(){
        return categoryService.findAllCategories();
    }
}
