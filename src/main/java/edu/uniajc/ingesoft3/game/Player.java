package edu.uniajc.ingesoft3.game;

/**
 * Created by alexhd on 8/30/14.
 */
public class Player {
    private Martians martians;

    public Player() {
        martians = Martians.getMartians();
    }

    public void killMartians() {
        martians.killMartian();
    }
}
