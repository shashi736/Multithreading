package org.example;

import java.util.concurrent.Semaphore;

public class SharedResource {
     boolean isAvailable=false;
    Semaphore lock= new Semaphore(4);
public void producer()
{
    try
    {
        lock.acquire();
        System.out.println("Lock Acquired By :"+Thread.currentThread().getName());
Thread.sleep(5000);

    }catch(Exception e)
    {

    }
    finally {
        lock.release();
        System.out.println("Lock Relesed By :"+Thread.currentThread().getName());
    }
}


}
