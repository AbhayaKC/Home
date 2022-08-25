package com.infosys;

import java.util.ArrayList;
import java.util.Arrays;

public class MountainArray2 {
    public static void main(String[] args) {
        //Input: nums = [,1,2,3,5,6,1]
        //Output: 3

    }
    static int minimumMountainRemovals(int[] nums) {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int num: nums) {
            if (!newArray.contains(num)){
                newArray.add(num);
            }
        }
        //
        int left = findlargest() - 1;
        for (int i = 0; i < newArray.size(); i++){
            for (int j =i; j < newArray.size();j++){


            }
        }




    }
    static int findlargest(int [] nums){
        int largest = 0;
        for (int i : nums){
            if(i > largest){
                largest = i;
            }
        }
        return largest;
    }
}
