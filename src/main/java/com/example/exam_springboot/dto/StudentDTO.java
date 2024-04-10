package com.example.exam_springboot.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class StudentDTO {
    private Long studentId;

    private String studentCode;

    private String fullName;
    private String address;
}