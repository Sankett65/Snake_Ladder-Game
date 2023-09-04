package com.bridgelabz;

import java.util.Random;

public class Snaket_Ladder {
    public static int user1=0;
    public static void main(String[] args) {
        System.out.println("Welcome to the Snaket & Ladder Game");

        System.out.println("!!! The player will start from 0 position !!!");
        Random r = new Random();
        int deice = r.nextInt(1,7);
        System.out.println("\nRolling the Deice and you got: "+deice);


        int check = r.nextInt(3);
        if (check==0){
            System.out.println("You have got Ladder");
            user1=user1+deice;
            System.out.println("Current position of user is: "+user1);
        } else if (check==1) {
            System.out.println("You have got Snake");
            user1 = user1 - deice;
            if (user1 > 0){
                user1 = user1;
            System.out.println("Current position of user is: " + user1);
        }else {
                user1=user1+deice;
                System.out.println("Current position of user is: " + user1);

            }
        }else {
            System.out.println("You have got Nothing");
            user1=user1+deice;
            System.out.println("Current position of user is: "+user1);

        }


    }
}
