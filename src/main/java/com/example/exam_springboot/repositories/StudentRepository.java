package com.example.exam_springboot.repositories;

import com.example.exam_springboot.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}