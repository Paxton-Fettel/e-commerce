package com.example.e_commerce.repository;

import com.example.e_commerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
    //====USER====
    List<Order> findByUser_Id(UUID id);
    boolean existsByUser_Id(UUID id);
    void deleteByUser_Id(UUID id);

    //====STATUS====
    List<Order> findByStatus(String status);
    boolean existsByStatus(String status);
    void deleteByStatus(String status);
}
