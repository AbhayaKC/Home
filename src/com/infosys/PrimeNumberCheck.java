package com.infosys;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(checkPrime(89));
    }

    private static String checkPrime(int givenNumber) {

        int counter = 0;

        if (givenNumber > 1){
            for (int i = 1; i <= givenNumber; i++){
                if (givenNumber % i == 0) {
                    counter++;
                }
            }
            if (counter >2){
                System.out.println(givenNumber + " isn't prime");
            }
            else {
                System.out.println(givenNumber + " is prime");
            }

        }
        else {
            System.out.println(givenNumber + " isn't prime.");
        }
        return "";
    }

}
