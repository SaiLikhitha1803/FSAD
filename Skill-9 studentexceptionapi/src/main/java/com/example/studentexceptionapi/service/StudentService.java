package com.example.studentexceptionapi.service;

import org.springframework.stereotype.Service;

import com.example.studentexceptionapi.entity.Student;
import com.example.studentexceptionapi.exception.StudentNotFoundException;

@Service
public class StudentService {

    public Student getStudent(int id) {

        if(id == 1) {
            Student s = new Student();
            s.setId(1);
            s.setName("Rahul");
            s.setCourse("CSE");
            return s;
        }

        throw new StudentNotFoundException("Student with ID " + id + " not found");
    }
}