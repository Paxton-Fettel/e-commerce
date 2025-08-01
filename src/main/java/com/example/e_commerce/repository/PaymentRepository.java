package com.example.e_commerce.repository;

import com.example.e_commerce.model.Payment;
import com.example.e_commerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, UUID> {
    //====ORDER_ID====
    List<Payment> findByOrder_Id(UUID id);
    boolean existsByOrder_Id(UUID id);
    void deleteByOrder_Id(UUID id);

    //====STATUS====
    List<Payment> findByStatus(String status);
    boolean existsByStatus(String status);
    void deleteByStatus(String status);

    //====TRANSACTION_ID====
    Payment findByTransactionId(String transactionId);
    boolean existsByTransactionId(String transactionId);
    void deleteByTransactionId(String transactionId);
}
