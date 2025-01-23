package org.example;

public class ProduceTask  implements Runnable{
    SharedResourced sharedResourced;
    ProduceTask(SharedResourced sharedResourced)
    {
        this.sharedResourced=sharedResourced;
    }
    @Override
    public void run() {
        System.out.println("Produced Thread :" +Thread.currentThread().getName());
        try
        {
            Thread.sleep(5000);
        }
        catch(Exception e)
        {

        }
        sharedResourced.addItem();
    }
}
