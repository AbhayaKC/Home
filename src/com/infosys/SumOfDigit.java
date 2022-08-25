package com.infosys;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sumOf(2220));
    }

    private static int sumOf(int originalNumber) {
        int remainder;
        int sum = 0;
        while (originalNumber != 0){
            remainder = originalNumber%10;
            sum+= remainder;
            originalNumber /= 10;
        }
        return sum;
    }
}
