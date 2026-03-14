package com.example.studentexceptionapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentexceptionapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}