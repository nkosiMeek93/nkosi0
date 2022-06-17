package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("WELCOME TO THE GAME !");

        System.out.println("what is your name ?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("welcome " + name + " to the guessing game");

        System.out.println("shall we begin ?");
        System.out.println("\t 1.YES");
        System.out.println("\t 2.NO");

        Scanner sc = new Scanner(System.in);
        int begin = sc.nextInt();

        while (begin != 1) {
            System.out.println("shall we begin ?");
            System.out.println("\t 1.YES");
            System.out.println("\t 2.NO");

            begin = sc.nextInt();
        }

        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println("please enter a number : ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean finished = false;

        while (!finished) {

            timesTried++;

            if (userInput == number) {

                hasWon = true;
                finished = true;

                    if (userInput > 8) {

                        System.out.println("too high ! ");
                        System.out.println("Re-enter a number : ");

                        userInput = scanner.nextInt();
                }
                            if (userInput < 5) {

                             System.out.println("Guess higher");
                             userInput = scanner.nextInt();

                }
            }
        else {
            finished = true;
            }
            System.out.println("the number was " + number);

        }if(hasWon){
            System.out.println("you have won");
        }

    }
}