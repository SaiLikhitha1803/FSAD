package com.example.studentbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentbackend.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
