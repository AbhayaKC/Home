package com.infosys;

public class EvenOddCounter {
    public static void main(String[] args) {
        System.out.println(evenOddCounter(12345600));

    }

    private static String evenOddCounter(int originalNumber) {

        int even = 0;
        int odd =0;
        while (originalNumber != 0){
            int remainder = originalNumber % 10;
            if (remainder % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
            originalNumber/=10;
        }

        return "Odd Numbers : " +odd + " Even number: " +even;
    }
}
