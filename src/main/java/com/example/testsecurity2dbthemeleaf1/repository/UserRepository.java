package com.example.testsecurity2dbthemeleaf1.repository;

import com.example.testsecurity2dbthemeleaf1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
