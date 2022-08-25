package com.infosys;

import java.util.Arrays;

public class CheckArrayEquals {
    public static void main(String[] args) {
        //        int [] firstArray = {1,2,3,4,5,6};
        //        int [] secondArray = {1,2,3,4,5,4};
        //        System.out.println(Arrays.equals(firstArray,secondArray));

        // Second way

        int[] a = {1, 2, 4};
        int[] b = {1, 2, 4};
        int counter = 0;
        boolean is_equal = true;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++)
                if (a[i] != b[i]) {
                    is_equal = false;
                    System.out.println("Arrays are not equal");
                    break;
                }
        }
        {

            if (is_equal) {
                System.out.println("Arrays are  equal");
            }
        }


    }
}

