package com.infosys;

public class MainThread extends Thread{

    int threadCounter;

    public MainThread(int threadCounter) {
        this.threadCounter = threadCounter;
    }

    public int getThreadCounter() {
        return threadCounter;
    }

    public void setThreadCounter(int threadCounter) {
        this.threadCounter = threadCounter;
    }

    @Override
    public void run(){
        for (int i =1 ; i <=5 ; i ++){
            System.out.println(i +" From Threadread Number " + threadCounter);
        }
    }
}
