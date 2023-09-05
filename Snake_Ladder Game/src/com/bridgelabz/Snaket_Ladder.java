package com.bridgelabz;

import java.util.Random;

public class Snaket_Ladder {
    public static int user1=0;
    public static int target =100;

    public static int count=0;


    public static void main(String[] args) {
        System.out.println("Welcome to the Snaket & Ladder Game");

        System.out.println("!!! The player will start from 0 position !!!");

        int count =0;

      for (int i =1;i<=100;i++){
          if (user1 == target) {
              break;
          }

            Random r = new Random();
            int deice = r.nextInt(1, 7);
            count++;
            System.out.println("\nRolling the Deice and you got: " + deice);

          int check = r.nextInt(3);

            if (check == 1) {
                System.out.println("You have got Ladder");
                user1 = user1 + deice;
                if (user1>target){
                    user1=user1 - deice;
                    System.out.println("Current position of user is: " + user1);
                    break;
                }
                System.out.println("Current position of user is: " + user1);
            } else if (check == 2) {
                if (user1 == target) {
                    break;
                }
                System.out.println("You have got Snake");
                if (user1 > target) {
                    user1 = user1;
                    break;
                }
                if (user1 > 0) {
                    user1 = user1;
                    System.out.println("Current position of user is: " + user1);
                } else {
                    user1 = user1 - deice;
                    System.out.println("Current position of user is: " + user1);
                }
            }else {
                System.out.println("You have got Nothing");
                user1 = user1 ;
                System.out.println("Current position of user is: " + user1);

            }
        }
      if (user1==target){
          System.out.println("\n!!! You Have Won !!!");
          System.out.println("Count taken to Win: "+count);
      }else {
          System.out.println("!!! Game is Over !!!");
      }

    }
}
