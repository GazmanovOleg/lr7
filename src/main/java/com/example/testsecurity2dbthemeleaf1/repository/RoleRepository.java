package com.example.testsecurity2dbthemeleaf1.repository;

import com.example.testsecurity2dbthemeleaf1.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
