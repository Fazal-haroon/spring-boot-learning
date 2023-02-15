package com.fazaltuts4u.learnjpaandhibernate.springdatajpa;

import com.fazaltuts4u.learnjpaandhibernate.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<CourseEntity, Long> {
    List<CourseEntity> findByAuthor(String author);
}
