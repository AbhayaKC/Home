package com.infosys;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reversed(1009));

    }

    private static int reversed(int originalNumber) {
        int reversed = 0;
        while(originalNumber != 0){
            reversed = reversed * 10 + originalNumber % 10;
            originalNumber/= 10;
        }
        return reversed;
    }


}
