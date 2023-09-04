package com.bridgelabz;

import java.util.Random;

public class Snaket_Ladder {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snaket & Ladder Game");
        int user1=0;
        System.out.println("!!! The player will start from 0 position !!!");
        Random r = new Random();
        int check = r.nextInt(1,7);
        System.out.println("\nRolling the Deice and you got: "+check);

    }
}
