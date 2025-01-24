package org.example;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

     boolean isAvailable=false;

     ReentrantLock lock=new ReentrantLock();

     public void producer()
     {
         try
         {
              lock.lock();
              System.out.println("Lock Acquired By : "+Thread.currentThread().getName());
              isAvailable=true;
              Thread.sleep(5000);

         }catch(Exception e)
         {

         }
         finally {
              lock.unlock();
              System.out.println("Thread Released By :"+Thread.currentThread().getName());
         }
     }
}
