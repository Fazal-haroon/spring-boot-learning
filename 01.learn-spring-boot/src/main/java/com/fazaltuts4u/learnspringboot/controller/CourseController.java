package com.fazaltuts4u.learnspringboot.controller;

import com.fazaltuts4u.learnspringboot.entity.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1, "AWS", "Fazal"),
                new Course(2, "DevOps", "Fazal 2")
        );
    }
}
