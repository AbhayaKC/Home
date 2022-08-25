package com.infosys;

import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,3,2,1};
        int n = 4;
        System.out.println(Arrays.toString(shuffle(arr,n)));


    }
    static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i = 0; i < n; i++){
            arr[2*i] = nums[i];
            arr[(2*i+1)] = nums[i+n];
        }

    return arr;
    }
}
