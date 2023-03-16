package com.spring.jwt.repos;

import com.spring.jwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByName(String name);
    Optional<User> findByNameAndEmail(String name, String email);
}
