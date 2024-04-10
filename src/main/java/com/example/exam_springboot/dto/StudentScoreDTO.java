package com.example.exam_springboot.dto;

import lombok.Data;


@Data
public class StudentScoreDTO {
    private Long studentScoreId;

    private Long studentId;
    private StudentDTO student;

    private Long subjectId;
    private SubjectDTO subject;

    private Double score1;
    private Double score2;
}