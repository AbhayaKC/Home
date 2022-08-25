package com.infosys;

public class MinMaxInArray {
    public static void main(String[] args) {
        int [] array = {3,4,8,5,1,8,2};
        int min = array[0];
        int max= array[0];
        for(int digit : array){
            if(min > digit){
                min = digit;
            }
            if(max < digit){
                max =digit;
            }
        }
        System.out.println("Min: " +min + " Max: " +max);

    }
}
