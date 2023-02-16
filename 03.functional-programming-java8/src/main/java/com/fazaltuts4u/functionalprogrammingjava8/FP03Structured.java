package com.fazaltuts4u.functionalprogrammingjava8;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03Structured {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring boot", "angular", "Microservices", "DevOps", "Go");
        Predicate<? super String> predicate = course -> course.startsWith("A") || course.startsWith("a");
        Optional<String> optional = courses.stream().filter(predicate).findFirst();
        if (optional.isPresent()) {
            System.out.println("optional = " + optional.get());
        }
        if (optional.isEmpty()) {
            System.out.println("Empty");
        }
    }
}
