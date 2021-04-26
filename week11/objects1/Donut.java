package objects1;

public class Donut {
    // member vars
    private int percRemaining = 100;
    public String name;

    // method: takes in an integer representing the size of bite
    // being taken of this donut. returns nothing
    public void simulateEating(int percentEaten){
        // subtract the bite size from the existing donut percent remaining
        percRemaining = percRemaining - percentEaten;
    }

    // method: takes no input parameters and returns percRemaining
    public int getPercRemaining(){
        // send back the value of one of the objects' member variables to the calling method
        return percRemaining;
    }

}
