package com.infosys;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int [] arr = {5,435,536,23,54};
        System.out.println(Arrays.toString(reverse(arr)));

    }

    static int[] reverse(int[] arrayToReverse){
        int start = 0;
        int end = arrayToReverse.length -1;

        while (start < end){
            swapArray(arrayToReverse, start, end);
                start++;
                end--;
            }
        return arrayToReverse;
    }

      static int[] swapArray(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
         array[firstIndex] = array[secondIndex];
         array[secondIndex] = temp;
        return array;
    }

}
