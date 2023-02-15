package com.fazaltuts4u.learnjpaandhibernate.jpa;

import com.fazaltuts4u.learnjpaandhibernate.entity.Course;
import com.fazaltuts4u.learnjpaandhibernate.entity.CourseEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

//    @Autowired
    @PersistenceContext //more specific annotation
    private EntityManager entityManager;

    public void insert(CourseEntity course){
        entityManager.merge(course);
    }

    public CourseEntity findById(long id){
        return entityManager.find(CourseEntity.class, id);
    }

    public void deleteById(long id) {
        CourseEntity course = entityManager.find(CourseEntity.class, id);
        entityManager.remove(course);
    }
}
