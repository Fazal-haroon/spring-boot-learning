package com.fazaltuts4u.learnjpaandhibernate.jdbc;

import com.fazaltuts4u.learnjpaandhibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository courseJDBCRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJDBCRepository.insert(new Course(1, "AWS", "Fazal Tuts4U"));
        courseJDBCRepository.insert(new Course(2, "Angular", "Fazal Tuts4U 2"));
        courseJDBCRepository.insert(new Course(3, "ReactJs", "Fazal Tuts4U 3"));

        courseJDBCRepository.deleteById(3);
    }
}
