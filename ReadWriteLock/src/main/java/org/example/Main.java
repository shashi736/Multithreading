package org.example;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource obj=new SharedResource();
        ReadWriteLock lock=new ReentrantReadWriteLock();

        Thread t1=new Thread(()->
        {
            obj.consumer(lock);

        });

        Thread t2=new Thread(()->
        {
            obj.consumer(lock);
        });

        Thread t3=new Thread(() ->
        {
            obj.producer(lock);
        });

        t1.start();
        t2.start();
        t3.start();
    }
}