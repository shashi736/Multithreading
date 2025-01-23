package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Method start");
        SharedResourced obj =new SharedResourced();
        Thread producerThread =new Thread(new ProduceTask(obj) );
        Thread consumerThread=new Thread(new ConsumeTask(obj));

        producerThread.start();
        consumerThread.start();

        System.out.println("Main Method End");
    }
}