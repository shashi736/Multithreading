package org.example;

public class Main {
    public static void main(String[] args) {
        SharedResource obj=new SharedResource();


        Thread t1=new Thread(()->
        {
            obj.consumer();

        });

        Thread t2=new Thread(()->
        {
            obj.consumer();
        });

        Thread t3=new Thread(() ->
        {
            obj.producer();
        });

        t1.start();
        t2.start();
        t3.start();
    }
}