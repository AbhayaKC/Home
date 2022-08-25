package com.infosys;

public class Arraydemo {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("he   jhwejka dfjahd fkjadhfkajd f"));

    }

    public static String removeWhiteSpaces(String givenString){
        String finalString = givenString.replace(" ", "");
        return finalString;
    }
}

