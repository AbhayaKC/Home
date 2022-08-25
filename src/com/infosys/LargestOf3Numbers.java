package com.infosys;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        System.out.println(largestOf(200, 8, 8));
    }

    private static int largestOf(int first, int second, int third) {
        if (first > second && first >third){
            return (first);
        }
        if (second > first && second >third){
            return (second);
        }
        return third;
    }
}
