package com.infosys;

public class EvenOddFromArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 45, 6, 6, 7, 7};
        System.out.println("Odd numbers are : ");
        for (int digits : numbers) {
            if (digits % 2 != 0) {
                System.out.println(digits);
            }
        }
            System.out.println("Even numbers are: ");
            for (int evenNumbers : numbers) {
                if (evenNumbers % 2 == 0) {
                    System.out.println(evenNumbers);
                }
            }
        }

}
