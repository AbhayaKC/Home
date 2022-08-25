    package com.basicogic;

import java.util.Arrays;

public class Array2Demo {
    public static void main(String[] args) {
        int[] arrayOne = {43,53,35,64};
        System.out.println(Arrays.toString(arrayOne));

        int [][] array2D = {
                {1,2,3},
                {4,5,6,7},
                {7,8,9}};
        for(int [] row: array2D){
            System.out.println(Arrays.toString(row));
        }
    }
}
