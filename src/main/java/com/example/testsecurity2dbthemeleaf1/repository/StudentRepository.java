package com.example.testsecurity2dbthemeleaf1.repository;

import com.example.testsecurity2dbthemeleaf1.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
