package com.example.CourseAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CourseAPI.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}