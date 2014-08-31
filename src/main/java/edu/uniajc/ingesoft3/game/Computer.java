package edu.uniajc.ingesoft3.game;

/**
 * Created by alexhd on 8/30/14.
 */
public class Computer {
    private Martians martians;

    public Computer() {
        martians = Martians.getMartians();
    }

    public void createMartians(){
        martians.createMartian();
    }
}
