package com.example.studentexceptionapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class StudentExceptionApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentExceptionApiApplication.class, args);
    }

}