package com.fazaltuts4u.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository //which talk to the database
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY =
            """  
                    INSERT into course(id, name, author) values(1, 'AWS', 'Teacher');
                    """;

    public void insert() {
        jdbcTemplate.update(INSERT_QUERY);
    }
}
