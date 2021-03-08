package com.asa;

import java.util.Scanner;

public class RideHeight {
    public static void main(String[] args) {
        final double MIN_RIDE_HEIGHT = 80.0;
        double RIDER_HEIGHT = 0.0;

        Scanner rideHeightScanner = new Scanner(System.in);
        System.out.println("Welcome to the gnarly roller coaster bro. What is your height? (cm):");
        RIDER_HEIGHT = rideHeightScanner.nextDouble();

    if(RIDER_HEIGHT < MIN_RIDE_HEIGHT){
            System.out.println("Sorry, too short to ride. :(");
        } else {
            System.out.println("Your height of " + RIDER_HEIGHT + " cm means you can ride. :)");
        }
    }
}
