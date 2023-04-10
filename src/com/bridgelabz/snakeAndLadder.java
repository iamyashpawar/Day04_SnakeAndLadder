package com.bridgelabz;

import java.util.Random;

public class snakeAndLadder
{

    static int position = 0;
    public static void main(String[] args)
    {
        System.out.println("Welcome to Snake and Ladder Simulation");
        Random rd = new Random();
        int die = rd.nextInt(1,7);
        int option = rd.nextInt(3);

        System.out.println("You got : "+ die);
        switch (option)
        {

            case 1:
                System.out.println("Your position is:  " + (position = position +die));
                System.out.println("You landed on ladder!! " +  (position = position + die));
                System.out.println("Your Current position is : " + position);
                break;
            case 2:
                System.out.println("Your position is:  " + (position = position +die));
                System.out.println("oh snap!!You just got bite from a snake "+ (position = position - 6));
                System.out.println("Your Current position is : " + position);
                break;
            default:
                System.out.println("No Play, Try Again");
                break;

        }
        

    }
}
