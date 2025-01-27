package org.example;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {boolean isAvailable=false;
    StampedLock lock=new StampedLock();
    public void consumer()
    {  long stamp=lock.readLock();
        try{
            System.out.println("Read Lock Acquired By : "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(5000);
        }catch(Exception e)
        {

        }
        finally {
         lock.unlockRead(stamp);
            System.out.println("Read Lock Released By :"+Thread.currentThread().getName());
        }
    }

    public void producer() {
   long stamp=lock.writeLock();
        try {


            System.out.println("Write Lock Acquired by :" + Thread.currentThread().getName());
            isAvailable = false;
        } catch (Exception e) {

        } finally {

            lock.unlockWrite(stamp);
            System.out.println("Write lock released by: "+ Thread.currentThread().getName());
        }
    }

}
