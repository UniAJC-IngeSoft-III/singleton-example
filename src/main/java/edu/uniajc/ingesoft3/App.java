package edu.uniajc.ingesoft3;

import edu.uniajc.ingesoft3.singleton.Singleton;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Singleton mySingleton0 = Singleton.getInstance();
        Singleton mySingleton1 = Singleton.getInstance();
        Singleton mySingleton2 = Singleton.getInstance();
        Singleton mySingleton3 = Singleton.getInstance();
        Singleton mySingleton4 = Singleton.getInstance();
        Singleton mySingleton5 = Singleton.getInstance();
        Singleton mySingleton6 = Singleton.getInstance();
        Singleton mySingleton7 = Singleton.getInstance();
        Singleton mySingleton8 = Singleton.getInstance();
        Singleton mySingleton9 = Singleton.getInstance();

        mySingleton0.getCount();
        System.out.println("End of program");
    }
}
