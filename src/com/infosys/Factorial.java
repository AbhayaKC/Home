package com.infosys;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int number) {
        int product = 1;
        while (number != 0){
            product *= number;
            number--;
        }
        return product;
    }
}
