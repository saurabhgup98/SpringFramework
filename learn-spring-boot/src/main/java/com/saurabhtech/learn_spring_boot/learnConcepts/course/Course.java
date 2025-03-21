package com.saurabhtech.learn_spring_boot.learnConcepts.course;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    private long id;
    private String course;
    private String author;

    public Course(long id, String course, String author) {
        this.id = id;
        this.course = course;
        this.author = author;
    }

    public Course() {
    }

    public long getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course='" + course + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
