package com.bridgelabz;

import java.util.Random;

public class snakeAndLadder {

    static int position = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulation");
        Random rd = new Random();


        // System.out.println("You rolled : "+ die);

        int die = rd.nextInt(1, 7);
        int option = rd.nextInt(3);
        int temp = 0;
        System.out.println("You rolled : " + die);

        while (position < 100) {
            switch (option) {

                case 1:
                    System.out.println("Your position is:  " + (temp = temp + die));
                    System.out.println("You landed on ladder!! ");
                    temp = temp + die;
                    position = temp;
                    if (position < 0) {
                        position = 0;
                    }
                    System.out.println("Your Current position is : " + position);
                    break;

                case 2:
                    System.out.println("Your position is:  " + (temp = temp + die));
                    System.out.println("oh snap!!You just got bite from a snake ");
                    temp = temp - die;
                    position = temp;
                    if (position < 0) {
                        position = 0;
                    }
                    System.out.println("Your Current position is : " + position);

                    break;

                default:
                    System.out.println("No Play, Try Again");
                    break;
            }


        }
        


    }
}
