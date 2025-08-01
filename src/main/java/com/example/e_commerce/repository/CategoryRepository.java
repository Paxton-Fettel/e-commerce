package com.example.e_commerce.repository;

import com.example.e_commerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID> {
    //====NAME====
    Category findByName(String name);
    boolean existsByName(String name);
    void deleteByName(String name);
}
