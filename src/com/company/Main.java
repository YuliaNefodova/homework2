package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Randomizer randomizer = new Randomizer();

        System.out.println( "1. Print a random number to the console.\n" +
                "2. Print 10 random numbers to the console.\n" +
                "3. Print 10 random numbers to the console, each in the range from 0 to 10.\n" +
                "4. Print 10 random numbers to the console, each in the range of 20 to 50.\n" +
                "5. Print 10 random numbers to the console, each in the range -10 to 10.\n" +
                "6. Print to the console a random number (in the range from 3 to 15) random numbers, each in the range from -10 to 35.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the task number from 1 to 6:");

        int numberTask = scanner.nextInt();

        switch (numberTask){
            case 1:
                randomizer.getRandNumber();
                break;
            case 2:
                randomizer.getRandTenNumbers();
                break;
            case 3:
                randomizer.getRandNumberFromMinToMax(0,10);
                break;
            case 4:
                randomizer.getRandNumberFromMinToMax(20,50);
                break;
            case 5:
                randomizer.getRandNumberFromMinToMax(-10,10);
                break;
            case 6:
                randomizer.getRandNumberFromMinToMaxInRange(3,15,0,35);
                break;
            default:
                System.out.println("Oops, you had to enter a number from 1 to 6.");

        }

    }






       /* int min = 100;
        int max = 200;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
*/
    }







