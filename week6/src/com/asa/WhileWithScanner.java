package com.asa;

import java.util.Scanner;

public class WhileWithScanner {

    public static void main(String[] args) {
	int numLoops = 1;
    int loopControl;
    String phrase;

    Scanner scanner = new Scanner(System.in);
    System.out.println("How many loops?");
    loopControl = scanner.nextInt();

    Scanner phrase_scanner = new Scanner(System.in);
    System.out.println("What phrase?");
    phrase = phrase_scanner.next();

	while(numLoops <= loopControl){
        System.out.println(phrase + " | " + "the number of loops: " + numLoops);
        numLoops = numLoops + 1;
    }
        System.out.println("Looping complete.");
    }
}
