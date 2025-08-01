package com.example.e_commerce.repository;

import com.example.e_commerce.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, UUID> {
    //====USER_ID====
    List<CartItem> findByUser_Id(UUID id);
    boolean existsByUser_Id(UUID id);
    void deleteByUser_Id(UUID id);
}
