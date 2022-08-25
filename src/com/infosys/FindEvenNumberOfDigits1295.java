package com.infosys;

public class FindEvenNumberOfDigits1295 {
    public static void main(String[] args) {
        int [] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int evenNumber = 0;
        for (int digits : nums) {
            int dc = digitCounter(digits);
            if (dc % 2 == 0){
                evenNumber++;
            }
        }
        return evenNumber;
    }
    static int digitCounter(int num){
        return ((int)Math.log10(num)+1);
    }
}
