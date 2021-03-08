package com.asa;

import java.util.Scanner;

public class UsernameAndPassword {
    public static void main(String[] args) {
       String USERNAME = "javaghost";
       String PASSWORD = "ic0d3";
       String INPUT_USERNAME;
       String INPUT_PASSWORD;


        Scanner UsernameAndPasswordScanner = new Scanner(System.in);
        System.out.println("What's your username?:");
        INPUT_USERNAME = UsernameAndPasswordScanner.next();

        System.out.println("What's your password?:");
        INPUT_PASSWORD = UsernameAndPasswordScanner.next();

        if(INPUT_USERNAME.equals(USERNAME) && INPUT_PASSWORD.equals(PASSWORD)){
            System.out.println("Authentication Success! You logged into nothing!");
        } else {
            System.out.println("Authentication Failed. You have entered the wrong username and/or password.");
        }
    }
}
