package org.example;


public class MonitorLockExample {

    public synchronized void task1()
    {
        try
        {System.out.println("Inside Task1");
            Thread.sleep(10000);
        }
        catch (Exception e)
        {

        }
    }
    public void task2()
    {
        System.out.println(" inside task 2 Before synchronized ");
        synchronized (this)
        {
            System.out.println("inside task  2");
        }
    }
    public  void task3()
    {
        System.out.println("Inside task 3");
    }
}