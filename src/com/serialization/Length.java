package com.serialization;

public class Length {
      static int lengthOfLastWord(String s) {

        String [] value = s.split(" ");

        int a = value.length-1;
        String something =  value[a];

        return something.length();
    }

    public static void main(String[] args) {
        String s = "Hello world jkjkjkjkjk";

        System.out.println(lengthOfLastWord(s));
    }
}
