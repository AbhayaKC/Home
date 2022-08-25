package com.infosys;

import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestCandies {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));

    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> values = new ArrayList<>();
        int highestCandy =0;
        for (int candy : candies) {
            if (candy > highestCandy){
                highestCandy = candy;
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= highestCandy){
                values.add(true);
            }else {
                values.add(false);
            }
        }
        return values;
    }
}
