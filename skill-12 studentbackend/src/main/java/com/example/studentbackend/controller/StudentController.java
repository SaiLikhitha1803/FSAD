package com.example.studentbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.studentbackend.model.Student;
import com.example.studentbackend.service.StudentService;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping("/students")
    public ResponseEntity<Student> addStudent(@RequestBody Student s){
        return ResponseEntity.ok(service.addStudent(s));
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok(service.getStudents());
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student s){
        return ResponseEntity.ok(service.updateStudent(id, s));
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
        return ResponseEntity.ok("Student Deleted");
    }
}