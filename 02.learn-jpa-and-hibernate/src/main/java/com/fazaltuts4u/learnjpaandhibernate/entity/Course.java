package com.fazaltuts4u.learnjpaandhibernate.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Course {
    private long id;
    private String name;
    private String author;
}