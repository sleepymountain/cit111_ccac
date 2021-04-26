package objects1;

public class Donut_Refactored {
    // member variables
    private int percRemaining = 100;
    public String name;

    public void simulateEating(int percentEaten){
        // subtract the bite size from the existing donut percent remaining
        percRemaining = percRemaining - percentEaten;
    }

    // method: takes no input parameters and returns percRemaining
    public int getPercRemaining(){
        return percRemaining;
    }

}
