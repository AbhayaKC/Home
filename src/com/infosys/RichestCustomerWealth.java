package com.infosys;

import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts =
                {{1, 2, 3},
                        {1, 2, 1},
                        {3, 3, 10},
                        {100, 200, 300},
                        {1, 2, 3, 4, 5, 4}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int finalSum = 0;
        int sum = 0;
        for (int[] array : accounts) {
            for (int digits : array) {
                sum += digits;
            }
            if (sum > finalSum){
                finalSum = sum;
            }
            sum =0;

        }
        return finalSum;

    }
}
