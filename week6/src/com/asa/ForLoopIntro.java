package com.asa;

import java.util.Scanner;

public class ForLoopIntro {

    public static void main(String[] args) {
    int loopControl;
    String phrase;

    Scanner scanner = new Scanner(System.in);
    System.out.println("How many loops?");
    loopControl = scanner.nextInt();

    Scanner phrase_scanner = new Scanner(System.in);
    System.out.println("What phrase?");
    phrase = phrase_scanner.next();

	for(int numLoops = 0; numLoops <= loopControl; numLoops = numLoops + 1){
        System.out.println(phrase + " | " + "the number of loops: " + numLoops);

    }
        System.out.println("Looping complete.");
    }
}
