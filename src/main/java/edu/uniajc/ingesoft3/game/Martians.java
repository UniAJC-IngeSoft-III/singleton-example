package edu.uniajc.ingesoft3.game;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by alexhd on 8/30/14.
 */
public final class Martians {
    private static final Martians martians = new Martians();
    private final AtomicInteger count = new AtomicInteger(10);

    private Martians(){
    }

    public static Martians getMartians(){
        return martians;
    }

    synchronized public void killMartian(){
        if(count.get() > 0){
            count.decrementAndGet();
            System.out.println("Martian has killed");
        }
    }

    synchronized public void createMartian(){
        if(count.get() > 0){
            count.incrementAndGet();
            System.out.println("Martian has created");
        }
    }

    synchronized public int countMartians(){
        int aliveMartians = count.get();
        switch (aliveMartians){
            case 0:
                System.out.println("You Win!!!");
                break;
            case 1:
                System.out.println("one Martian, remain in game");
                break;
            default:
                System.out.printf("%d Martians, remain in game", aliveMartians);
        }
        return aliveMartians;
    }
}
