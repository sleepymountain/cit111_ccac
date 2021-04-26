package objects1;

public class DonutLand_Refactored {

    final static int bigBite = 20;
    final static int smallBite = 3;

public static void main(String[] args){

    Donut firstDonut;
    firstDonut = new Donut();

    firstDonut.name = "Chloe";

    printObjectData(firstDonut);

    Donut secondDonut;
    secondDonut = new Donut();
    secondDonut.name = "Marv";

    printObjectData(secondDonut);

    System.out.println(firstDonut.name + " is being eaten.");
    System.out.println("User took a big bite.");
    firstDonut.simulateEating(bigBite);
    System.out.println("User took a small bite.");
    firstDonut.simulateEating(smallBite);
    printObjectData(firstDonut);

    System.out.println(secondDonut.name + " is being eaten.");
    System.out.println("User took a small bite.");
    firstDonut.simulateEating(smallBite);
    System.out.println("User took a big bite.");
    firstDonut.simulateEating(bigBite);
    printObjectData(secondDonut);

}

private static void printObjectData(Donut inputDonut){
    System.out.println("---------------");
    System.out.println("| Name: " + inputDonut.name);
    System.out.println("| %Remaining: " + inputDonut.getPercRemaining());
    System.out.println("---------------");
}
}
