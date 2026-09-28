package com.siza.persistence.repository;

import com.siza.persistence.entity.Category;
import com.siza.persistence.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
