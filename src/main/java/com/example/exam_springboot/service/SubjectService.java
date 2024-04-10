package com.example.exam_springboot.service;

import com.example.exam_springboot.dto.SubjectDTO;
import com.example.exam_springboot.entities.Subject;
import com.example.exam_springboot.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<SubjectDTO> getAllSubjects() {
        List<Subject> subjects = subjectRepository.findAll();
        List<SubjectDTO> subjectDTOs = new ArrayList<>();

        for (Subject subject : subjects) {
            SubjectDTO subjectDTO = new SubjectDTO();
            subjectDTO.setSubjectId(subject.getSubjectId());
            subjectDTO.setSubjectCode(subject.getSubjectCode());
            subjectDTO.setSubjectName(subject.getSubjectName());
            subjectDTO.setCredit(subject.getCredit());
            subjectDTOs.add(subjectDTO);
        }

        return subjectDTOs;
    }

    public SubjectDTO createSubject(SubjectDTO subjectDTO) {
        Subject subject = new Subject();
        subject.setSubjectCode(subjectDTO.getSubjectCode());
        subject.setSubjectName(subjectDTO.getSubjectName());
        subject.setCredit(subjectDTO.getCredit());

        Subject savedSubject = subjectRepository.save(subject);

        SubjectDTO savedSubjectDTO = new SubjectDTO();
        savedSubjectDTO.setSubjectId(savedSubject.getSubjectId());
        savedSubjectDTO.setSubjectCode(savedSubject.getSubjectCode());
        savedSubjectDTO.setSubjectName(savedSubject.getSubjectName());
        savedSubjectDTO.setCredit(savedSubject.getCredit());

        return savedSubjectDTO;
    }
}