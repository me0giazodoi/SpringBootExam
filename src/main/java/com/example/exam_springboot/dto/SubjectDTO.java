package com.example.exam_springboot.dto;

import lombok.Data;

@Data
public class SubjectDTO {
    private Long subjectId;
    private String subjectCode;
    private String subjectName;
    private Integer credit;
}