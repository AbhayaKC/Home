package com.infosys;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RunningSumArray {
    public static void main(String[] args) {
        int [] number = {1,2,4,3};
        System.out.println(Arrays.toString(runningSum(number)));
    }
    static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] sumArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            sumArray[i]  = sum + nums[i];
            sum = sumArray[i];
        }
        return sumArray;
    }
}
