package com.siza.services.impl;

import com.siza.dtos.CategoryDto;
import com.siza.mappers.CategoryMapper;
import com.siza.persistence.entity.Category;
import com.siza.persistence.entity.Users;
import com.siza.persistence.repository.CategoryRepository;
import com.siza.services.CategoryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDto> findAllCategories() {
        List<Category> categoryRepositoryAll = categoryRepository.findAll();
        List<CategoryDto> categoryDtos = new ArrayList<>();
        if(!categoryRepositoryAll.isEmpty()){
            for (Category category : categoryRepositoryAll) {
                categoryDtos.add(CategoryMapper.toDto(category));
            }
        }
        return categoryDtos;
    }
}
