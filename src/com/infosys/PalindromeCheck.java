package com.infosys;

public class PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(checkPalindrome(" recer "));
    }

    private static boolean checkPalindrome(String originalWord) {
        String reversed = "";
        boolean solution = false;
        for (int i = originalWord.length() - 1; i >= 0; i--) {
            reversed += originalWord.charAt(i);
        }
        if (originalWord.equals(reversed)) {
            solution = true;
        }
        return solution;
    }
}
