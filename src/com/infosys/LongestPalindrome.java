package com.infosys;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "ababbb";
        System.out.println(longestPalindrome(s));
    }
    static String longestPalindrome(String s){
       String storage = "";
        String og = reverseString(s);
       for (int i =0; i< s.length(); i++){
           if (og.charAt(i)==s.charAt(i)){
               storage+= og.charAt(i);
           }
       }
        return storage;
    }
    static String reverseString(String s){
        String reversed = "";
        for (int i = s.length()-1; i >=0; i--){
            reversed+= s.charAt(i);
        }
        return reversed;
    }
}
