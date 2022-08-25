package com.infosys;

public class ArrayElementSum {
    public static void main(String[] args) {
        int[] bottle = {2,3,4,5};
        int total = 0;
        for (int sum : bottle) {
            total += sum;
        }
        System.out.println(total);
    }
}
