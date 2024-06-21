package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Game Of Life");
        System.out.println("\0337");
        for (int i = 0; i < 6; i++) {

            //Grid
            for (int y = 0; y < 6; y++) {
                for (int x = 0; x < 6; x++) {
                    if (Math.random() > 0.5) {
                        //Tuščiaviduris kvadratukas
                        System.out.print("\u25A1 ");
                    }else{
                        //Pilnaviduris kvadratukas
                        System.out.print("\033[91m\u25A0\033[0m ");
                    }
                }

                System.out.println();
            }
            System.out.println();
        }
        Thread.sleep(1000);
        System.out.println("\0338");
        System.out.println("\033[93m Geltonas tekstas \033[0m");
        System.out.println("\033[92m Žalias tekstas \033[0m");
        System.out.println("\033[91m Raudonas tekstas \033[0m");
        System.out.println("\033[94m Mėlina tekstas \033[0m");
        System.out.println("\033[95m Violetinė spalva \033[0m");
        System.out.println("\033[96m Turkio spalva \033[0m");

    }
}