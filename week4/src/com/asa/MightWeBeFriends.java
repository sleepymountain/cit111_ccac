package com.asa;

import java.util.Random;
import java.util.Scanner;

public class MightWeBeFriends {
    // Answers to questions stored in variables
    static int RESPONSE_MUSIC_LISTENING;
    static int RESPONSE_MUSIC_CREATION;
    static int RESPONSE_SOCCER;

    // Create scanner for user input
    static Scanner responseScanner = new Scanner(System.in);

    // Point system that is calculated at the end of each response
    static int totalScore = 0;

    public static void main(String[] args) {

        // Question One - Do you listen to music?
        // If answer is yes (1) add ten to totalScore and move to side question. If no (0), move to next question

        // Ask the question
        System.out.println("[Q1] Do you like listening to music? (0 = no, 1 = yes)");

        //Scan for user input and store in response variable
        RESPONSE_MUSIC_LISTENING = responseScanner.nextInt();

        //Check user input and check if user should be awarded points
        if(RESPONSE_MUSIC_LISTENING == 1){
            // Award the user 10 points and add response
            totalScore = totalScore + 10;
            System.out.println("Sweet, I love music too. I can't imagine someone who doesn't.");
            System.out.println("You current score is now: " + totalScore);
            System.out.println();

            // Award the user the side/bonus question for earning points on this question.
            bonusQuestion(null);
        } else {
            // Verbally harass the user or something like that
            System.out.println("Interesting, I'm not sure how this must've happened.");
            System.out.println("You current score is now: " + totalScore);
            System.out.println();
        }

        //Question Three - Do you like soccer?
        // If answer is yes (1) add ten to totalScore and move to next question. If no (0), move to next question

        //Ask the question
        System.out.println("[Q2] Do you like european football/soccer? (0 = no, 1 = yes)");

        //Scan for user input and store in response variable
        RESPONSE_SOCCER = responseScanner.nextInt();

        //Check user input and check if user should be awarded points
        if(RESPONSE_SOCCER == 1){
            // Award the user 10 points and add response
            totalScore = totalScore + 10;
            System.out.println("I love soccer. My favorite league is Bundesliga, and my favorite club is FC Bayern.");
            System.out.println("You current score is now: " + totalScore);
            System.out.println();

        } else {
            // Verbally harass the user or something like that
            System.out.println("That's okay.");
            System.out.println("You current score is now: " + totalScore);
            System.out.println();
        }

        // Calculate Total Score and Check Friend Compatibility Status

        // Random number between the two specified integers for microwave
        Random r = new Random();
        int low = 10;
        int high = 25;
        int result = r.nextInt(high-low) + low;

        System.out.println("Learning math..");
        System.out.println("Calculating total score...");
        System.out.println("Putting results in the microwave for " + result + " seconds....");
        System.out.println();
        wait(2000);
        System.out.println("Oh look, the results are in! And.. they are hot.");

        if(totalScore >= 10){
            System.out.println("You scored a total of " + totalScore + " points.");
            System.out.println("We would definitely make good friends!");
            System.out.println();
        } else {
            System.out.println("You scored a total of " + totalScore + " points.");
            System.out.println("That's unfortunate news.. you aren't very good at this game.");
            System.out.println("We might not be friends.");
            System.out.println();
        }
    }

    public static void bonusQuestion(String[] args) {
        // Question 1.5 - Do you make music?
        // If answer is yes (1) add five to totalScore and move to next question. If no (0), move to next question

        //Ask the question
        System.out.println("[Q1.5] So you like music! Do you make music too? (0 = no, 1 = yes)");

        //Scan for user input and store in response variable
        RESPONSE_MUSIC_CREATION = responseScanner.nextInt();

        //Check user input and check if user should be awarded points
        if(RESPONSE_MUSIC_CREATION == 1){
            // Award the user 5 points and add response
            totalScore = totalScore + 5;
            System.out.println("I make music too!");
            System.out.println("You current score is now: " + totalScore);
            System.out.println();

        } else {
            // Verbally harass the user or something like that
            System.out.println("Not everyone does, it's fun though.");
            System.out.println("You current score is now: " + totalScore);
            System.out.println();
        }
    }

    // wait function for dramatic effect
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
