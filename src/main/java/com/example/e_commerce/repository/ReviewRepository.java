package com.example.e_commerce.repository;

import com.example.e_commerce.model.Review;
import com.example.e_commerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ReviewRepository extends JpaRepository<Review, UUID> {
    //====USER_ID====
    List<Review> findByUser_Id(UUID id);
    boolean existsByUser_Id(UUID id);
    void deleteByUser_Id(UUID id);

    //====PRODUCT_ID====
    List<Review> findByProduct_Id(UUID id);
    boolean existsByProduct_Id(UUID id);
    void deleteByProduct_Id(UUID id);
}
