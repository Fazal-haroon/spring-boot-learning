package com.fazaltuts4u.functionalprogrammingjava8;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
//        printAllNumbersInListStructured(List.of(21,2,3,4,11,25,15,112));
//        printAllNumbersInListFunctional(List.of(21, 2, 3, 4, 11, 25, 15, 112));
        printEvenNumbersInListStructured(List.of(21,2,3,4,11,25,15,112));
        printEvenNumbersInListFunctional(List.of(21,2,3,4,11,25,15,112));
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
//        numbers.stream().forEach(num -> System.out.println(num));
        numbers.stream().forEach(System.out::println);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream().filter(num -> num%2==0).forEach(System.out::println);
    }

//    private static void print(int number){
//        System.out.println("number = " + number);
//    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for(int number: numbers){
            System.out.println("number = " + number);
        }
    }

    private static void printEvenNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("number = " + number);
            }
        }
    }
}
