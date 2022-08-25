package com.infosys;

import java.util.Locale;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("ahk adeg").toUpperCase());
    }

    public static String reverseString(String word){
        String reversed = "";
        for (int i = word.length() -1; i >= 0; i--){
           reversed += word.charAt(i);
        }
        return reversed;
    }

    
}
