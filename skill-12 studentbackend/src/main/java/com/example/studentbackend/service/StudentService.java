package com.example.studentbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentbackend.model.Student;
import com.example.studentbackend.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student addStudent(Student s){
        return repo.save(s);
    }

    public List<Student> getStudents(){
        return repo.findAll();
    }

    public Student updateStudent(int id, Student s){
        Student st = repo.findById(id).get();
        st.setName(s.getName());
        st.setEmail(s.getEmail());
        st.setCourse(s.getCourse());
        return repo.save(st);
    }

    public void deleteStudent(int id){
        repo.deleteById(id);
    }
}
