package com.bridgelabz;

import java.util.Random;

public class Snaket_Ladder {
    public static int user1=0;
    public  static int user2=0;
    public static int target =100;

    public static int count=0;
    public static int count1=0;


    public static void main(String[] args) {
        System.out.println("Welcome to the Snaket & Ladder Game");

        System.out.println("!!! The player will start from 0 position !!!");



      for (int i =1;i<=100;i++){
          if (user1 == target || user2 == target) {
              break;
          }

            Random r = new Random();
            int deice = r.nextInt(1, 7);
            count++;
            System.out.println("\nRolling the Deice for USER1 : " + deice);
          int check = r.nextInt(3);

          if (check == 1 ) {
              System.out.println("You have got Ladder");
              user1 = user1 + deice;
              if (user1>target ){
                  user1=user1 - deice;
                  System.out.println("Current position of USER1 is: " + user1);
                  break;
              }
              System.out.println("Current position of USER1 is: " + user1);

          }  else if (check == 2 ) {
              if (user1 == target ) {
                  break;
              }
              System.out.println("You have got Snake");
              if (user1 > target ) {
                  user1 = user1;

                  break;
              }
              if (user1 > 0 ) {
                  user1 = user1;
                  System.out.println("Current position of USER1 is: " + user1);

              } else {
                  user1 = user1 - deice;
                  System.out.println("Current position of USER1 is: " + user1);
              }


          } else if (check==0){
              System.out.println("You have got Nothing");
              user1 = user1 ;
              System.out.println("Current position of USER1 is: " + user1);
          }

          Random c = new Random();
          int deice1 = c.nextInt(1, 7);
          count1++;
          System.out.println("\nRolling the Deice for USER2 : " + deice);
          int check1 = c.nextInt(3);


          if (check1==1) {
              System.out.println("You have got Ladder");
              user2 = user2 + deice1;
              if ( user2>target){
                  user2=user2 - deice1;
                  System.out.println("Current position of USER2 is: " + user2);
                  break;
              }
              System.out.println("Current position of USER2 is: " + user2);

          }else if (check1==2) {
              if (check1 == target) {
                  break;
              }
              System.out.println("You have got Snake");
              if (user2 > target) {
                  user2 = user2;
                  break;
              }
              if ( user2 > 0) {
                  user2 = user2;
                  System.out.println("Current position of USER2 is: " + user2);

              } else {
                  user2 = user2 - deice1;
                  System.out.println("Current position of USER2 is: " + user2);
              }
          }else  {
              System.out.println("You have got Nothing");
              user2=user2;
              System.out.println("Current position of USER2 is: " + user2);
          }


      }

      if (user1==target){
          System.out.println("\n!!! USER1 Have Won !!!");
          System.out.println("Count taken to Win: "+count);
      }else if (user2==target){
          System.out.println("\n!!! USER2 Have Won !!!");
          System.out.println("Count taken to Win: "+count1);
      }else {
          System.out.println("\n!!! Game Over !!!");
      }

    }
}
