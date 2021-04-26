package objects1;

public class DonutLand {
public static void main(String[] args){
    final int firstBiteSize = 12;

    //create a handle variable that can store references to Donut objects
    Donut firstDonut;
    // create a new donut (instance) and connect to handle
    firstDonut = new Donut();

    // access firstDonut's name property
    // store name "chloe" in property
    firstDonut.name = "Chloe";

    // print a test of firstDonut's member variable values
    System.out.println("When first created, " + firstDonut.name + "s\n" + "percent remaining is " + firstDonut.getPercRemaining());
    printDivider();

    // call in a method simulateEating on firstDonut obj and pass firstBiteSize as a parameter
    firstDonut.simulateEating(firstBiteSize);

    System.out.println("After being eaten, " + firstDonut.name + "s\n" + "percent remaining is " + firstDonut.getPercRemaining());

}

private static void printDivider(){
    System.out.println("..........................");
}
}
