package com.infosys;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,8,9,10};
        int counter = 0;
        int sumTotalB = 0;
        for(int nums : array){
            counter = nums;
            sumTotalB+=nums;
        }

        int sumTotal = 0;
        for (int i = 0;i <= counter; i++){
            sumTotal += i;
        }

        System.out.println(sumTotal -sumTotalB);
    }
}
