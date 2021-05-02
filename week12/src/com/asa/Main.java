package com.asa;

import java.util.Random;
import java.util.Scanner;

class gameClass {
    // member variables
    double startingMoney;
    double currentMoney;
    double winnings = 0.0;
    double losses = 0.0;
    int roundsPlayed = 0;
    double endMoney = 0.0;
    int guess;
    int choice;

    public void getStartingMoney(){
        // ask user how much money they have
        System.out.println("How much money do you have?");
        Scanner input = new Scanner(System.in);
        // store in var: startingMoney
        startingMoney = input.nextDouble();
        // print startingMoney and pass to startGame method
        if(startingMoney<20){
            System.out.println("Please deposit at least $20.");
            System.out.println();
            getStartingMoney();
        } else {
            System.out.println("Okay, you have $" + startingMoney + " let's start the game!");
            currentMoney = startingMoney;
            System.out.println();
            startGame();
        }
    }

    public void startGame(){
        // read currentMoney
        if(currentMoney < 20.0){
            System.out.println("Current Money: $" + currentMoney);
            System.out.println("You don't have enough money to play any more rounds. Printing your stats..");
            endGame();
        } else {
            Game();
        }
        // if user wants to play again, loop, if not, endGame()
    }

    public void Game(){
        System.out.println("Starting round!");
        System.out.println("Playing with: $" + currentMoney);
        // create random number using random class
        int roundRandom = randomNumber(0, 200);
        //System.out.println(roundRandom); // for debugging
        // ask user to guess random number between a defined range
        System.out.println("Guess the number between (1-200) !");
        Scanner guesser = new Scanner(System.in);
        guess = guesser.nextInt();
        System.out.println("You guessed " + guess + " the number was " + roundRandom);
        // if user was close within a defined threshold to the number, reward with a money bonus, if not deduct money
        if(guess + 10 == roundRandom || guess - 10 == roundRandom || guess == roundRandom){
            //win
            System.out.println("You guessed correctly! You were awarded with $10 and a refund of this round.");
            winnings = winnings + 10;
            currentMoney = currentMoney + 13;
        }else{
            //loss
            System.out.println("Sorry, your guess was incorrect. You lost the money you spent on this round, and $5.");
            currentMoney = currentMoney - 8;
            losses = losses - 8;
        }
        roundsPlayed = roundsPlayed + 1;
        endMoney = currentMoney;
        // if user wants to play again, loop, if not, endGame()
        System.out.println("Do you want to play another round? | (1=yes)(0=no)");
        Scanner selection = new Scanner(System.in);
        choice = selection.nextInt();
        if (choice == 1){
            startGame();
        } else {
            endGame();
        }
    }

    public void endGame(){
        // print statistics: winnings, losses, roundsPlayed, endMoney
        System.out.println("++++ Statistics ++++");
        System.out.println("Winnings: $" + winnings);
        System.out.println("Losses: $" + losses);
        System.out.println("Rounds Played: " + roundsPlayed);
        System.out.println("End Money: " + endMoney);
        // print game end message and quit
        System.out.println("Thanks for playing. Remember, don't gamble, kids!");
    }

    public static int randomNumber(int min, int max){
        // use random number class and generate a random number using the values passed through
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

}

public class Main {


    public static void main(String[] args) {
	    // print intro
        System.out.println("Welcome to the Casino!");
        System.out.println();
        gameRules();
        System.out.println();
        System.out.println("To play our game, you must deposit at least $20.");
        System.out.println();
        gameClass newGame = new gameClass();
        newGame.getStartingMoney();
    }

    public static void gameRules(){
        System.out.println("++ How to play ++");
        System.out.println("1. You will have to guess a random number, between 0-200, if you are exactly 10 away from the number, or guess the random number correctly, you will be awarded with a cash bonus.");
        System.out.println("2. If you are too far from the number, you will lose money.");
        System.out.println("3. Each round costs $3");
        System.out.println();
        System.out.println("Simple right? Let's begin.");
        System.out.println("Starting game...");
        System.out.println();
    }

}


