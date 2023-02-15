package com.fazaltuts4u.functionalprogrammingjava8;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(21,2,3,4,11,25,15,112));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        for(int number: numbers){
            System.out.println("number = " + number);
        }
    }
}
