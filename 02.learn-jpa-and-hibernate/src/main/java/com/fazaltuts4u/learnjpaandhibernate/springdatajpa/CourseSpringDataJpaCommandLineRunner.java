package com.fazaltuts4u.learnjpaandhibernate.springdatajpa;

import com.fazaltuts4u.learnjpaandhibernate.entity.CourseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseSpringDataJpaCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository springDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        springDataJpaRepository.save(new CourseEntity(1, "AWS 2", "Fazal Tuts4U"));
        springDataJpaRepository.save(new CourseEntity(2, "Angular 2", "Fazal Tuts4U 2"));
        springDataJpaRepository.save(new CourseEntity(3, "ReactJs 2", "Fazal Tuts4U 3"));

        springDataJpaRepository.deleteById(3l);

        System.out.println("findById(1) = " + springDataJpaRepository.findById(1l));
        System.out.println("findById(2) = " + springDataJpaRepository.findById(2l).toString());

        System.out.println("springDataJpaRepository = " + springDataJpaRepository.findAll());
        System.out.println("springDataJpaRepository.count = " + springDataJpaRepository.count());

        System.out.println("springDataJpaRepository.findByAuthor = " + springDataJpaRepository.findByAuthor("Fazal Tuts4U 2"));
    }
}
