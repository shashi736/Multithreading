package org.example;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {

    boolean isAvailable=false;
   public void consumer(ReadWriteLock lock)
   {
       try{
           lock.readLock().lock();
           System.out.println("Read Lock Acquired By : "+Thread.currentThread().getName());
           isAvailable=true;
           Thread.sleep(5000);
       }catch(Exception e)
       {

       }
       finally {
           lock.readLock().unlock();
           System.out.println("Read Lock Released By :"+Thread.currentThread().getName());
       }
   }

   public void producer(ReadWriteLock lock)
   {
       try{
           lock.writeLock().lock();
           System.out.println("Write Lock Acquired by :"+ Thread.currentThread().getName());
           isAvailable=false;
       }catch(Exception e)
       {

       }
       finally {
           lock.writeLock().unlock();
           System.out.println("Write Realsed by:"+Thread.currentThread().getName());
       }
   }

}
