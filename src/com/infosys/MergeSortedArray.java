package com.infosys;

import java.util.*;
import java.util.stream.Stream;

public class MergeSortedArray {
    public static void main(String[] args) {
        int n [] = {0,1,2};
        int m [] = {0,7,8,9};

        ArrayList <Integer> storage = new ArrayList();


        for(int i = 0; i <n.length; i++){
            storage.add(n[i]);
        }
        for (int i = 0; i <m.length; i++){
            storage.add(m[i]);
        }


        Collections.sort(storage);
        System.out.println(storage);

        }


}
