package com.fazaltuts4u.functionalprogrammingjava8;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Structured {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(21, 2, 3, 4, 11, 25, 15, 112);
        printOddNumListFunctional(numbers);
        System.out.println("======================");

        List<String> courses = List.of("Spring", "Spring boot", "Angular", "Microservices", "DevOps", "Go");
        courses.stream().forEach(System.out::println);
        System.out.println("======================");

        courses.stream().filter(courseName -> courseName.contains("Spring")).forEach(System.out::println);
        System.out.println("======================");

        List<Integer> multiple = numbers.stream().filter(num -> num % 2 == 0).map(x -> x * x).collect(Collectors.toList());
        System.out.println("multiple of Even Numbers List = " + multiple);

        System.out.println("======================");
        courses.stream().map(course -> course + " Length is : " + course.length()).forEach(System.out::println);
    }

    private static void printOddNumListFunctional(List<Integer> numbers){
        numbers.stream().filter(num -> num%2 != 0).forEach(nums -> System.out.println("nums = " + nums));
    }
}
