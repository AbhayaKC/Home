package com.infosys;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int [ ] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
        static int numIdenticalPairs(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length;i++){
            for (int j = i+1; j < nums.length;j++){
                if (nums[i] == nums[j]) total++;
            }
        }
        return total;
    }

}
