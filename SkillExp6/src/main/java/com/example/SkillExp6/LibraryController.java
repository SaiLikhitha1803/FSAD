package com.example.SkillExp6;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class LibraryController {

    @GetMapping("/welcome")
    public String display()
    {
        return "Welcome to Spring Boot";
    }

}