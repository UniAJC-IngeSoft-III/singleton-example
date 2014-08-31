package edu.uniajc.ingesoft3;

import edu.uniajc.ingesoft3.game.Computer;
import edu.uniajc.ingesoft3.game.Martians;
import edu.uniajc.ingesoft3.game.Player;

import java.util.Scanner;

/**
 * Created by alexhd on 8/30/14.
 */
public class Game {

    public static void main(String[] args) {
        Martians martians = Martians.getMartians();
        Computer computer = new Computer();
        Player player = new Player();
        Scanner sc;

        sc = new Scanner(System.in);
        int shots;
        do {
            System.out.println("How many shots you need?");
            shots = sc.nextInt();
            for (int i = 0; i < shots; i++) {
                player.killMartians();
            }
            computer.createMartians();
            martians.countMartians();
        }while (shots != 0);
    }
}
