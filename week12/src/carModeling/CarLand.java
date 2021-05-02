package carModeling;

public class CarLand {
    public static void main(String[] args){
        // create new instance of a Car object with the keyword new
        Car deLorean = new Car();
        // set member variables on the instance of Car stored in deLorean
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";

        // send our Car instance to a helper method to print its member variables
        displayCarStats(deLorean);
        // test its methods
        deLorean.startEngine();
        deLorean.accelerate(88);
        deLorean.decelerate(12);
        // check status again
        displayCarStats(deLorean);
        deLorean.stopEngine();
        displayCarStats(deLorean);

        // create new instance of a Car object with the keyword new
        Car Datsun = new Car();
        // set member variables on the instance of Car stored in Datsun
        Datsun.year = 1974;
        Datsun.makeModel = "Datsun 260Z";

        // send our Car instance to a helper method to print its member variables
        displayCarStats(Datsun);
        // test its methods
        Datsun.startEngine();
        Datsun.accelerate(55);
        Datsun.decelerate(55);
        // check status again
        displayCarStats(Datsun);
        Datsun.stopEngine();
        displayCarStats(Datsun);


    }

    public static void displayCarStats(Car anyCarObject){
        System.out.println("***** STATS *****");
        System.out.println(anyCarObject.year + " " + anyCarObject.makeModel);
        System.out.println("Engine running status: " + anyCarObject.checkEngineStatus());
        System.out.println("Current speed: " + anyCarObject.getCurrentSpeed());
        System.out.println("*****************");
    }
}
