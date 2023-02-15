package com.fazaltuts4u.learnjpaandhibernate.jpa;

import com.fazaltuts4u.learnjpaandhibernate.entity.Course;
import com.fazaltuts4u.learnjpaandhibernate.entity.CourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJpaRepository.insert(new CourseEntity(1, "AWS", "Fazal Tuts4U"));
        courseJpaRepository.insert(new CourseEntity(2, "Angular", "Fazal Tuts4U 2"));
        courseJpaRepository.insert(new CourseEntity(3, "ReactJs", "Fazal Tuts4U 3"));

        courseJpaRepository.deleteById(3);

        System.out.println("findById(1) = " + courseJpaRepository.findById(1));
        System.out.println("findById(2) = " + courseJpaRepository.findById(2).toString());
    }
}
