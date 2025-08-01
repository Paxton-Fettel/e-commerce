package com.example.e_commerce.repository;

import com.example.e_commerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    //====USERNAME====
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
    void deleteByUsername(String name);

    //====EMAIL====
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
    void deleteByEmail(String email);
}
