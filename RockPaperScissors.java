package com.furkancabuk;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void play() {

        int computerPoint = 0;
        int playerPoint = 0;

        boolean isPlay = true;
        System.out.println("**********ROCK PAPER SCISSORS *************");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (isPlay) {

            int randomNumber = random.nextInt(3);
            String computerChoice = "";
            switch (randomNumber) {
                case 0:
                    computerChoice = "Rock";
                    break;
                case 1:
                    computerChoice = "Paper";
                    break;
                case 2:
                    computerChoice = "Scissors";
                    break;
            }

            System.out.println("for Rock    : 1 ");
            System.out.println("for Paper   : 2");
            System.out.println("for Scissors: 3");
            System.out.println("to Exit     : 4");
            int playerNumber = scanner.nextInt();
            scanner.nextLine();
            String playerChoice ="";
            switch (playerNumber) {
                case 1:
                    playerChoice = "Rock";
                    break;
                case 2:
                    playerChoice = "Paper";
                    break;
                case 3:
                    playerChoice = "Scissors";
                    break;
                case 4:
                    System.out.println("***************");
                    System.out.println("END");
                    System.out.println("Computer: " + computerPoint);
                    System.out.println("You       : " + playerPoint);
                    if (playerPoint == computerPoint) {
                        System.out.println("======DRAW======");
                    } else if (playerPoint > computerPoint) {
                        System.out.println("+++++VICTORIOUS+++++");
                    } else {
                        System.out.println("-----LOSE-----");
                    }
                    isPlay = false;
                    break;
                default:
                    playerChoice = "Rock";
                    break;
            }
            if (computerChoice.equals("Scissors") && playerChoice.equals("Scissors")) {
                System.out.println("PC     vs      You");
                System.out.println("Scissors       -       Scissors");
                System.out.println("DRAW!");
                System.out.println();
            }
            if (computerChoice.equals("Rock") && playerChoice.equals("Rock")) {
                System.out.println("PC     vs      You");
                System.out.println("Rock       -       Rock");
                System.out.println("DRAW!");
                System.out.println();
            }
            if (computerChoice.equals("Paper") && playerChoice.equals("Paper")) {
                System.out.println("PC     vs      You");
                System.out.println("Paper       -       Paper");
                System.out.println("DRAW!");
                System.out.println();
            }
            if (computerChoice.equals("Rock") && playerChoice.equals("Paper")) {
                System.out.println("PC     vs      You");
                System.out.println("Rock       -       Paper");
                System.out.println("player +1 point");
                playerPoint += 1;
                System.out.println();
            }
            if (computerChoice.equals("Rock") && playerChoice.equals("Scissors")) {
                System.out.println("PC     vs      You");
                System.out.println("Rock       -       Scissor");
                System.out.println("computer +1 point");
                computerPoint += 1;
                System.out.println();
            }
            if (computerChoice.equals("Paper") && playerChoice.equals("Scissors")) {
                System.out.println("PC     vs      You");
                System.out.println("Paper       -       Scissor");
                System.out.println("player +1 point");
                playerPoint += 1;
                System.out.println();
            }
            if (computerChoice.equals("Paper") && playerChoice.equals("Rock")) {
                System.out.println("PC     vs      You");
                System.out.println("Paper       -       Rock");
                System.out.println("computer +1 point");
                computerPoint += 1;
                System.out.println();
            }
            if (computerChoice.equals("Scissors") && playerChoice.equals("Rock")) {
                System.out.println("PC     vs      You");
                System.out.println("Scissors       -       Rock");
                System.out.println("player +1 point");
                playerPoint += 1;
                System.out.println();
            }
            if (computerChoice.equals("Scissors") && playerChoice.equals("Paper")) {
                System.out.println("PC     vs      You");
                System.out.println("Scissors       -       Paper");
                System.out.println("computer +1 point");
                computerPoint += 1;
                System.out.println();
            }
        }
    }
}
