package com.asa;

import java.util.Scanner;

public class Authentication {
    public static void main(String[] args) {
        String PASSWORD = "sup3rsecur3p4ssw0rd"; // peak cybersecurity
        String INPUT_PASSWORD; // string for the scanner to store user input
        int INPUT_SECURITY_KEY; // integer for the scanner to store user input for security code
        final int security_key = 1337; // the correct security key
        final int maxAttempts = 5; // maximum number of allowed attempts

        for (int attempts = 1; attempts <= maxAttempts; attempts++) {
            Scanner passScanner = new Scanner(System.in); // scan for password
            System.out.println("What's your password?:");
            INPUT_PASSWORD = passScanner.next(); // store userinput in password variable
            if (INPUT_PASSWORD.equals(PASSWORD)) { // check if password is correct
                Scanner securityScanner = new Scanner(System.in); // scan for security key
                System.out.println("What is the security key?");
                INPUT_SECURITY_KEY = securityScanner.nextInt(); // store userinput in security key var

                if (INPUT_SECURITY_KEY == security_key){ // check if the user's security key is correct
                    System.out.println("Authentication Success!");
                    System.out.println();
                    System.out.println("********************************");
                    System.out.println("secret message | cats r cool");
                    System.out.println("********************************");
                    break;
                } else { // if the security key is not correct
                    System.out.println("Incorrect Security Key. Please try again.");
                    System.out.println("Number of attempts " + attempts);
                    System.out.println("Max Attempts: " + maxAttempts);
                }

            } else { // if the password is not correct
                System.out.println("Incorrect Password, try again.");
                System.out.println("Number of attempts " + attempts);
                System.out.println("Max Attempts: " + maxAttempts);

            }
            System.out.println("No more attempts. Goodbye."); // when the max number of attempts has been reached
        }
    }
}
