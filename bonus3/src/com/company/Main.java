package com.company;

import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean play = true;
        boolean gameOn = true;
        int tries = 1;
        while (gameOn) {
            int randNumber = new Random().nextInt(100 + 1);
            System.out.println(" ");
            System.out.println("I'm thinking of a number between 1 and 100.");
            System.out.println("can you guess my number?");

//            System.out.println(randNumber);

            while (play) {
                System.out.println(" ");
                System.out.print("enter your choice:");
                int userInput = scnr.nextInt();

                if (userInput == randNumber) {
                    System.out.println(" ");
                    System.out.println("That was my number! It took you " + tries + " tries.");
                    break;
                } else if (userInput > randNumber) {
                    tries++;
                    if ((userInput - randNumber) > 10) {
                        System.out.println("Way too high!");
                    } else if ((userInput - randNumber) > 0 && (userInput - randNumber) <= 10) {
                        System.out.println("Too high!");
                    }
                } else if (userInput < randNumber) {
                    tries++;
                    if ((randNumber - userInput) > 10) {
                        System.out.println("Way too low!");
                    } else if ((randNumber - userInput) > 0 && (userInput - randNumber) <= 10) {
                        System.out.println("Too low!");
                    }
                }
            }
            System.out.print("Would you like to play again? (y/n):");
            String input = scnr.next();
            input.toLowerCase();
            if (input.charAt(0) == 'n')
                break;
        }
    }
}
