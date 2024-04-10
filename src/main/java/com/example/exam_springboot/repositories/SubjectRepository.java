package com.example.exam_springboot.repositories;
import com.example.exam_springboot.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Long> {
}