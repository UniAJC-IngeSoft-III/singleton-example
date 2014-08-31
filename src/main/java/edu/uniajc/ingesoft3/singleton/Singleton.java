package edu.uniajc.ingesoft3.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by alexhd on 8/30/14.
 */
public final class Singleton {
    private static final Singleton singleton = new Singleton();
    private static final AtomicInteger count = new AtomicInteger(0);

    private Singleton() {
        System.out.println("Hi, only one instance was created");
    }

    public static Singleton getInstance(){
        count.incrementAndGet();
        return singleton;
    }

    public static void getCount(){
        System.out.println("this method was called " + count + " times");
    }
}
