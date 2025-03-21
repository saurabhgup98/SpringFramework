package com.saurabhtech.learn_spring_boot.spring_data_jpa.course.springdatajpa;

import com.saurabhtech.learn_spring_boot.learnConcepts.course.Course;
import com.saurabhtech.learn_spring_boot.spring_data_jpa.course.jpa.JpaRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
    List<Course> findByAuthor(String author);
}
