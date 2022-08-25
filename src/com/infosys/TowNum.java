package com.infosys;

import java.util.ArrayList;
import java.util.Arrays;

public class TowNum {
    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        System.out.println(twoSum(array, 26));
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] storage = {0,0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    storage[0] = i;
                    storage[1] = j;
                }
            }

        }
        System.out.println(storage[0]);
        System.out.println(storage[1]);
        return storage;
    }
    }
