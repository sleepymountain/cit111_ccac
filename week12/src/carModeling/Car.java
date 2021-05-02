package carModeling;

public class Car {
    // public member variables: we don't need to implement logic
    // to change these values
    public int year;
    public String makeModel;

    // private member variables because we want to control their values: outside classes access these through methods
    private boolean isEngineRunning;
    private double speed;

    // simulation of starting the car
    public void startEngine(){
        isEngineRunning = true;
        System.out.println("[i] Engine is running.");
    }

    // simulation of stopping the car
    public void stopEngine(){
        isEngineRunning = false;
        System.out.println("[i] Engine is no longer running.");
    }

    // allows access to our private engine status boolean member variable called isEngineRunning
    // returns the status of the engine, true = on, false = off.
    public boolean checkEngineStatus(){
        return isEngineRunning;
    }

    // allows access to our private speed variable, returns this car object's current speed as a double
    public double getCurrentSpeed(){
        return speed;
    }

    // controls the car's increase in speed, using mphIncrease
    // returns the current speed of the car after acceleration has been taken into account
    public double accelerate(int mphIncrease){
        speed = speed + mphIncrease;
        return speed;
    }

    // controls the car's decrease in speed, using mphDecrease
    // returns the current speed of the car after deceleration has been taken into account
    public double decelerate(int mphDecrease){
        if(mphDecrease>=speed){
            System.out.println("Deceleration force is greater than or equal to the current speed! Stopping the vehicle.");
            speed = 0;
        } else {
            speed = speed - mphDecrease;
        }
        return speed;
    }
}
