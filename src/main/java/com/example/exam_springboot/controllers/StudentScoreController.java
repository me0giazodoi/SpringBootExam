package com.example.exam_springboot.controllers;


import com.example.exam_springboot.dto.StudentScoreDTO;
import com.example.exam_springboot.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/studentscore")
public class StudentScoreController {
    @Autowired
    private StudentScoreService studentScoreService;

    @GetMapping()
    public List<StudentScoreDTO> getAll(){
        return studentScoreService.getAllStudentScores();
    }

    @PostMapping()
    public StudentScoreDTO createStudentScore(@RequestBody StudentScoreDTO studentScoreDTO){
        return studentScoreService.createStudentScore(studentScoreDTO);
    }
}