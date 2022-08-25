package com.infosys;

import java.util.Random;

public class GenerateRandom {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        System.out.println(randomNumber.nextInt(900));
        System.out.println(Math.random());
    }
}
