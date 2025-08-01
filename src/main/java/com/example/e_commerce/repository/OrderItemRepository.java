package com.example.e_commerce.repository;

import com.example.e_commerce.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {
    //====ORDER_ID====
    List<OrderItem> findByOrder_Id(UUID id);
    boolean existsByOrder_Id(UUID id);
    void deleteByOrder_Id(UUID id);
}
