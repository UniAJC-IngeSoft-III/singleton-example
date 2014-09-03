package edu.uniajc.ingesoft3.game;

/**
 * Created by alexhd on 8/30/14.
 */
public final class Martians {
    private static final Martians martians = new Martians();
    private int count = 10;

    private Martians(){
    }

    public static Martians getMartians(){
        return martians;
    }

    synchronized public void killMartian(){
        if(count > 0){
            count--;
            System.out.println("Martian has killed");
        }
    }

    synchronized public void createMartian(){
        if(count > 0){
            count++;
            System.out.println("Martian has created");
        }
    }

    synchronized public int countMartians(){
        switch (count){
            case 0:
                System.out.println("You Win!!!");
                break;
            case 1:
                System.out.println("one Martian, remain in game");
                break;
            default:
                System.out.printf("%d Martians, remain in game", count);
        }
        return count;
    }
}
