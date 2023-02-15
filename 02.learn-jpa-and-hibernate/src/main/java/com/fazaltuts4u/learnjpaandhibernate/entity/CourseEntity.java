package com.fazaltuts4u.learnjpaandhibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "COURSE_TABLE")
public class CourseEntity {
    @Id
    @Column(name = "COURSE_ID")
    private long id;
    @Column(name = "COURSE_NAME")
    private String name;
    @Column(name = "COURSE_AUTHOR")
    private String author;
}