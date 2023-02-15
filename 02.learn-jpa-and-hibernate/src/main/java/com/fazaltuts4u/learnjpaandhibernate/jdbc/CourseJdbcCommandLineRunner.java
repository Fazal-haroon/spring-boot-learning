package com.fazaltuts4u.learnjpaandhibernate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository courseJDBCRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJDBCRepository.insert();
    }
}
