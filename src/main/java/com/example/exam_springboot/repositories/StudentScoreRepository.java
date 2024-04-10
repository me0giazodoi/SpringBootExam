package com.example.exam_springboot.repositories;

import com.example.exam_springboot.entities.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentScoreRepository extends JpaRepository<StudentScore,Long> {
}