package com.asa;

import java.util.Scanner;

public class SpeedEnforcement {
    public static void main(String[] args) {
        int MIN_SPEED = 40;
        int MAX_SPEED = 55;
        int EXCESSIVE_SPEED;
        int carSpeed;

        Scanner SpeedEnforcementScanner = new Scanner(System.in);
        System.out.println("Enter speed of car in mph, then press enter:");
        carSpeed = SpeedEnforcementScanner.nextInt();

        if(carSpeed < MIN_SPEED){
            System.out.println("Car is travelling too slowly.");
        } else if(carSpeed > MAX_SPEED) {
            System.out.println("Car is travelling over the speed limit.");
        } else {
            System.out.println("Car is within appropriate speed range.");

        }
    }
}
