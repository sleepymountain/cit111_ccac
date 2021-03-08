package com.asa;

public class RoadTrip {

    public static void main(String[] args) {
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5;
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double tripBudget = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;

        double carMPG = 32.0;
        double gasPrice = 2.65;

        double legDistance;
        System.out.println("+x+Road trip sim+x+");
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName);
        System.out.println("Distance of Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + ": Current Odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println("Trip with " + currentNumberOfPassengers + " Passenger(s)");
        System.out.println("Destination Reached? " + destinationReached);

        System.out.println("");
        System.out.println("Starting first leg of trip:");
        // Calculate leg distance: 25% of total trip, store in legDistance
        double decimalOfOneQuarter = .25;
        legDistance = distanceToMoabUtah * decimalOfOneQuarter;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);

        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance;

        // subtract leg distance from distanceTo destination, over-write distanceTo
        distanceToMoabUtah = distanceToMoabUtah - legDistance;

        // "See" hitch hiker heading West
        System.out.println("");
        System.out.println("Oh, look! A person who wants to go west, too!");

        // Check if there is room in the car, if so, pick up hitch hiker
        if(!carFull) {
            System.out.println("Car is not full, picking up hitcher");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
        }

        // calculate price of gas for the first leg and store in temp variable
        double gasPriceForLeg = (legDistance / carMPG) * gasPrice;

        // deduct $ spent of gas from money remaining and over-write tripBudget
        tripBudget = tripBudget - gasPriceForLeg;

        // reprint status of variables to the console
        System.out.println("");
        System.out.println("-=- Updated variables after leg 1 -=-");
        System.out.println("Distance of Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + ": Current Odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println("Trip with " + currentNumberOfPassengers + " Passenger(s)");
        System.out.println("Destination Reached? " + destinationReached);

        // Set Leg 2 distance
        legDistance = 500.00;
        tripOdometer = tripOdometer + legDistance;
        System.out.println("");
        System.out.println("Starting second leg of trip:");
        System.out.println("CHECK LEG DISTANCE: " + legDistance);

        // 2 more hitchhikers
        System.out.println("");
        System.out.println("Oh, Two more WestBound travelers! Check car capacity status.");
        if(!carFull) {
            System.out.println("Car is not full, picking up hitchers");
            currentNumberOfPassengers = currentNumberOfPassengers + 2;
        }

        // fuel price for leg two
        gasPriceForLeg = (legDistance / carMPG) * gasPrice;
        tripBudget = tripBudget - gasPriceForLeg;
        System.out.println("Money spent on gas during leg 2: " + gasPriceForLeg);

        System.out.println("");
        System.out.println("-=- Updated variables after leg 2 -=-");
        System.out.println("Distance of Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + ": Current Odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println("Trip with " + currentNumberOfPassengers + " Passenger(s)");
        System.out.println("Destination Reached? " + destinationReached);

        // set leg 3 distance: last leg is the remaining distance
        legDistance = distanceToMoabUtah - legDistance;
        tripOdometer = tripOdometer + legDistance;
        System.out.println("");
        System.out.println("Starting third and final leg of trip:");
        System.out.println("CHECK LEG DISTANCE: " + legDistance);

        // two more hitch-hikers
        System.out.println("");
        System.out.println("More hitchers: another pair! Can we fit them?");

        int legThreeHitcherCount = 2;
        if(currentNumberOfPassengers + legThreeHitcherCount <= maxPassengers) {
            System.out.println("Car is not full, picking up hitchers");
            currentNumberOfPassengers = currentNumberOfPassengers + 2;
        } else {
            System.out.println("Too many folks--can't take ya, sorry!");
        }

        // fuel price for leg three
        gasPriceForLeg = (legDistance / carMPG) * gasPrice;
        tripBudget = tripBudget - gasPriceForLeg;
        System.out.println("Money spent on gas during leg 3: " + gasPriceForLeg);

        // destination reached?
        destinationReached = true;

        System.out.println("");
        System.out.println("-=- Updated variables after leg 3 -=-");
        System.out.println("Distance of Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + ": Current Odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println("Trip with " + currentNumberOfPassengers + " Passenger(s)");
        System.out.println("Destination Reached? " + destinationReached);
    }
}
