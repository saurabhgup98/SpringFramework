package com.saurabhtech.learn_spring_boot.spring_data_jpa.course;

import com.saurabhtech.learn_spring_boot.learnConcepts.course.Course;
import com.saurabhtech.learn_spring_boot.spring_data_jpa.course.jdbc.jdbcRepo;
import com.saurabhtech.learn_spring_boot.spring_data_jpa.course.jpa.JpaRepo;
import com.saurabhtech.learn_spring_boot.spring_data_jpa.course.springdatajpa.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    @Autowired
    private jdbcRepo jdbcRepo;

    @Autowired
    private JpaRepo jpaRepo;

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public void run(String... args) throws Exception {
        /*jdbcRepo.insertUsingCourseClass(new Course(1,"Learn AWS","in-28-min"));
        jdbcRepo.insertUsingCourseClass(new Course(2,"Learn Python","Harsh"));
        jdbcRepo.insertUsingManualQuery();
        jdbcRepo.deleteById(1L);
        System.out.println(jdbcRepo.fetchCourseById(2L));

        jpaRepo.insertUsingClassCourse(new Course(10,"Learn Java","Telisko"));
        jpaRepo.insertUsingClassCourse(new Course(11,"Learn C++","Local Tutor"));
        System.out.println(jpaRepo.findById(10));
        jpaRepo.deleteById(10);

        courseRepo.save(new Course(21,"Learn Ruby","Michel Londa"));
        courseRepo.save(new Course(22,"Learn Rusk","Michal Obama"));
        System.out.println(courseRepo.findById(21L));
        courseRepo.deleteById(22L);
        System.out.println(courseRepo.findAll());
        System.out.println(courseRepo.count());
        System.out.println(courseRepo.findByAuthor("Harsh"));*/
    }
}
