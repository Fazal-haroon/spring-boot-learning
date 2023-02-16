package com.fazaltuts4u.functionalprogrammingjava8;

import java.util.List;

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

    }

    private static void printOddNumListFunctional(List<Integer> numbers){
        numbers.stream().filter(num -> num%2 != 0).forEach(nums -> System.out.println("nums = " + nums));
    }
}
