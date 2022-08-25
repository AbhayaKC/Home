package com.infosys;

import java.util.Arrays;

public class One {
    public static void main(String[] args) {
        int []value = {9,9};
        System.out.println(Arrays.toString(plusOne(value)));
    }


    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        if(digits[0] == 0) {
            int[] num = new int[digits.length + 1];
            num[0] = 1;
            return num;
        }
        return digits;
    }
}
