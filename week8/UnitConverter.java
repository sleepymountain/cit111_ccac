package com.asa;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String [] args){
        //Title
        System.out.println("---- Volvo/European Unit Conversion Tool ----");
        System.out.println("Used to convert european units from the Volvo VIDA repair guides to American friendly ones.");
        System.out.println();
        System.out.println("Welcome. Choose a converter by entering it's corresponding number.");
        System.out.println("(1) Newton-Meters to Foot-Pounds");
        System.out.println("(2) kPa to psi");
        System.out.println("(3) kmph to mph");
        System.out.println("(4) Quit.");
        System.out.println("Enter a number:");

        // Scanner for user inputs
        Scanner inputScanner = new Scanner(System.in);

        // Scanner and Setup for Menu
        Scanner menuScanner = new Scanner(System.in);
        int selection = menuScanner.nextInt();
            switch (selection) {
                case 1:
                    // Newton-Meters to Foot-Pounds
                    System.out.println();
                    System.out.println("[!] Newton-Meters to Foot-Pounds");
                    System.out.println("Enter the amount of Newton-Meters to Convert to Foot-Pounds:");
                    double UserNewtonMeters = inputScanner.nextDouble();
                    //calc conversion and print output
                    System.out.println(UserNewtonMeters + " Newton-Meters is " + newtonMetersToFootPounds(UserNewtonMeters) + " Foot-Pounds.");
                    break;
                case 2:
                    // Kilo-Pascal to PSI
                    System.out.println();
                    System.out.println("[!] kPa to psi");
                    System.out.println("Enter the amount of Kilo-Pascal to Convert to PSI:");
                    double UserKiloPascal = inputScanner.nextDouble();
                    //calc conversion and print output
                    System.out.println(UserKiloPascal + " kPa is " + kiloPascalToPSI(UserKiloPascal) + " psi.");
                    break;
                case 3:
                    // Kilometers per Hour to Miles per Hour
                    System.out.println();
                    System.out.println("[!] kmph to mph");
                    System.out.println("Enter the amount of kmph to Convert to mph:");
                    double UserKilometersPerHour = inputScanner.nextDouble();
                    //calc conversion and print output
                    System.out.println(UserKilometersPerHour + " kmph " + kmphTomph(UserKilometersPerHour) + " mph.");
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Thanks for using the converter, goodbye.");
                    System.exit(0);
            }
        }


    public static double newtonMetersToFootPounds(double newtonMeters){
        // One Newton Meter = 0.73756215 Foot Pounds
        double footPounds = newtonMeters * 0.73756215;
        return footPounds;
    }

    public static double kiloPascalToPSI(double kiloPascal){
        // One kPa = 0.145 psi
        double PSI = kiloPascal * 0.145;
        return PSI;
    }

    public static double kmphTomph(double kilometers){
        // One kmph = 0.62137119223733 mph
        double mph = kilometers * 0.62137119223733;
        return mph;
    }

}
