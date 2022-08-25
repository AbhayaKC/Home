package com.infosys;

import java.util.HashSet;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,5,6,7};
        HashSet<Integer> duplicate = new HashSet<>();
        for(int digit : array){
            if (duplicate.add(digit) == false){
                System.out.println(digit);
            }
        }



//        for (int i = 0; i <array.length; i++){
//            for (int j = i + 1; j <array.length; j++){
//                if (array[i]== array[j]){
//                    System.out.println(array[i]);
//                    break;
//                }
//            }
//        }
        // System.out.println(digitOne);
    }
}
