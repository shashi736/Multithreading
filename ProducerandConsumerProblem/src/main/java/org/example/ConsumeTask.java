package org.example;

public class ConsumeTask  implements Runnable{
    SharedResourced sharedResourced;
    ConsumeTask(SharedResourced sharedResourced)
    {
        this.sharedResourced=sharedResourced;
    }
    @Override
    public void run() {
        System.out.println("Item Consumed By :"+Thread.currentThread().getName());
        sharedResourced.consumeItem();
    }
}
