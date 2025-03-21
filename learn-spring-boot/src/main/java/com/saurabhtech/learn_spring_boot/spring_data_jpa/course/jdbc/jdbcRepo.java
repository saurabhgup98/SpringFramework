package com.saurabhtech.learn_spring_boot.spring_data_jpa.course.jdbc;

import com.saurabhtech.learn_spring_boot.learnConcepts.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class jdbcRepo {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static final String INSERT_QUERY_MANUALLY =
            """
                        insert into course (id, course, author)  values(0,'Mech', 'Mumbai Uni');
                    """;
    private static final String INSERT_QUERY_USING_COURSE_CLASS =
            """
                        insert into course (id, course, author)  values(?,?,?);
                    """;
    private static final String DELETE_QUERY_BY_ID =
            """
                        DELETE FROM COURSE WHERE id = ?;
                    """;
    private static final String SELECT_QUERY_BY_ID =
            """
                        SELECT * FROM COURSE WHERE id = ?;
                    """;

    public void insertUsingManualQuery(){
        springJdbcTemplate.update(INSERT_QUERY_MANUALLY);
    }

    public void insertUsingCourseClass(Course course){
        springJdbcTemplate.update(INSERT_QUERY_USING_COURSE_CLASS,course.getId(),course.getCourse(),course.getAuthor());
    }

    public void deleteById(Long id){
        springJdbcTemplate.update(DELETE_QUERY_BY_ID,id);
    }

    public Course fetchCourseById(Long id){
        // Result Set to -> Bean Mapping using Row Mapper
        return springJdbcTemplate.queryForObject(SELECT_QUERY_BY_ID,new BeanPropertyRowMapper<>(Course.class),id);
    }
}
