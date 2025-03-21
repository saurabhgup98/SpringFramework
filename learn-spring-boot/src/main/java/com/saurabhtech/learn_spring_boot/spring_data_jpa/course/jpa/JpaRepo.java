package com.saurabhtech.learn_spring_boot.spring_data_jpa.course.jpa;

import com.saurabhtech.learn_spring_boot.learnConcepts.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class JpaRepo {
    // We can either use Autowired or below
    @PersistenceContext
    private EntityManager entityManager;

    public void insertUsingClassCourse(Course course){
        entityManager.merge(course);
    }

    public Course findById(long id){
        return entityManager.find(Course.class,id);
    }

    public void deleteById(long id){
        Course courseToDelete = entityManager.find(Course.class,id);
        entityManager.remove(courseToDelete);
    }
}
