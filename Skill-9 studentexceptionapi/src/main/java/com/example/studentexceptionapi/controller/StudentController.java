package com.example.studentexceptionapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.studentexceptionapi.entity.Student;
import com.example.studentexceptionapi.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {
        return service.getStudent(id);
    }
}