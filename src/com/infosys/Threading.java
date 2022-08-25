package com.infosys;

public class Threading {
    public static void main(String[] args) throws InterruptedException {

        for(int i =1 ; i <=3; i ++) {
            MainThread mainThread = new MainThread(i);
            MainThread mainThread1 = new MainThread(i);


            mainThread.start();
            mainThread.sleep(1000);
            System.out.println("Request Timeout of 1 sec is added");
            mainThread.sleep(1000);
            mainThread1.start();


            System.out.println(Thread.activeCount());
            System.out.println(Thread.currentThread().getName());


        }
    }
}
