package com.example.CourseAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CourseAPI.entity.Course;
import com.example.CourseAPI.repository.CourseRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repo;

    public Course addCourse(Course c) {
        return repo.save(c);
    }

    public List<Course> getCourses() {
        return repo.findAll();
    }

    public Course updateCourse(int id, Course c) {

        Course course = repo.findById(id).orElse(null);

        if (course != null) {
            course.setTitle(c.getTitle());
            course.setDuration(c.getDuration());
            course.setFee(c.getFee());
            return repo.save(course);
        }

        return null;
    }

    public String deleteCourse(int id) {
        repo.deleteById(id);
        return "Course Deleted";
    }
}