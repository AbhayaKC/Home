package com.infosys;

public class DigitCounter {
    public static void main(String[] args) {
        System.out.println(countDigit(890987));
    }

    private static int countDigit(int originalNumber) {
        int counter = 0;
        while (originalNumber != 0){
            originalNumber /= 10;
            counter++;
        }
        return counter;
    }
}
