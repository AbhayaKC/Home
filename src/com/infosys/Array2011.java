package com.infosys;

public class Array2011 {
    public static void main(String[] args) {
        String [] array = {"--X","X++","X++"};
        int sum = 0;
        for (String s : array) {
            if (s.contains("--X" )|| s.contains("X--")){
                sum--;
            }else sum++;

        }
        System.out.println(sum);
    }
}
