package org.example;

public class SharedResourced {
    boolean isItemAvailable=false;

    public  synchronized  void addItem()
    {
         isItemAvailable=true;
        System.out.println("Item added by " + Thread.currentThread().getName());
        notifyAll();
    }

    public  synchronized void consumeItem()
    {
        System.out.println("consumeItem method invoked by: " +Thread.currentThread().getName());

        if(!isItemAvailable)
        {
            try{
                System.out.println("Thread "  + Thread.currentThread().getName() + "wating now");
                wait();// It Releases Monitor Lock
            }catch(Exception e)
            {

            }
            System.out.println("Item Consumed by: "+Thread.currentThread().getName());
            isItemAvailable=false;
        }
    }

}
