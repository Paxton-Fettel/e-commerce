package com.example.e_commerce.repository;

import com.example.e_commerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    //====NAME====
    List<Product> findByName(String name);
    boolean existsByName(String name);
    void deleteByName(String name);

    //====PRICE====
    List<Product> findByPrice(BigDecimal price);

    //====CATEGORY====
    List<Product> findByCategory_Id(UUID id);
    boolean existsByCategory_Id(UUID id);
    void deleteByCategory_Id(UUID id);
}
