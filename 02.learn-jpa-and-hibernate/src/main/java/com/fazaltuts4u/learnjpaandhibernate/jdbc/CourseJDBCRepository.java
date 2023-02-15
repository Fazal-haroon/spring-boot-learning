package com.fazaltuts4u.learnjpaandhibernate.jdbc;

import com.fazaltuts4u.learnjpaandhibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository //which talk to the database
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY_Hardcoded =
            """  
                    INSERT into course(id, name, author) values(1, 'AWS', 'Teacher');
                    """;

    private static String INSERT_QUERY =
            """  
                    INSERT INTO course(id, name, author) VALUES(?, ?, ?);
                    """;

    private static String DELETE_QUERY =
            """  
                    DELETE FROM course WHERE id = ?
                                        """;

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(long id) {
        jdbcTemplate.update(DELETE_QUERY, id);
    }
}
