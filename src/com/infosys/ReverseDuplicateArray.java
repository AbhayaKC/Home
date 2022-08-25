package com.infosys;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseDuplicateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,4,5,5,6,11,2,32,34,1};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = array.length - 1; i >=0; i--) {
            if (!list.contains(array[i])){
                list.add(array[i]);
            }

        }
        System.out.println(list);
        }


    }

