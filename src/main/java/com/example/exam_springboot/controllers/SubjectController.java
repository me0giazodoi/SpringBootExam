package com.example.exam_springboot.controllers;


import com.example.exam_springboot.dto.SubjectDTO;
import com.example.exam_springboot.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping()
    public List<SubjectDTO> getAll(){
        return subjectService.getAllSubjects();
    }

    @PostMapping()
    public SubjectDTO createSubject(@RequestBody SubjectDTO subjectDTO){
        return subjectService.createSubject(subjectDTO);
    }

}