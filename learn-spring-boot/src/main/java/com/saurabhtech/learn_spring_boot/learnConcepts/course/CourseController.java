package com.saurabhtech.learn_spring_boot.learnConcepts.course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Aws", "in28Min"),
                new Course(2, "Learn React", "react-aur-chai"),
                new Course(3, "Learn Typescript", "Sheriyars Coding"),
                new Course(4, "Learn JavaScript", "Sheriyars Coding"),
                new Course(5, "Learn Java", "in28Min")

        );
    }
}
