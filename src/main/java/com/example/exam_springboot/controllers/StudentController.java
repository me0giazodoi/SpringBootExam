package com.example.exam_springboot.controllers;

import com.example.exam_springboot.dto.StudentDTO;
import com.example.exam_springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping()
    public List<StudentDTO> getAll(){
        return studentService.getAllStudents();
    }

    @PostMapping()
    public StudentDTO createStudent(@RequestBody StudentDTO studentDTO){
        return studentService.createStudent(studentDTO);
    }
}