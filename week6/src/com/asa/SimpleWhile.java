package com.asa;

public class SimpleWhile {

    public static void main(String[] args) {
	int numLoops = 0;

	while(numLoops <= 1000){
        System.out.println("The number of loops: " + numLoops);
        numLoops = numLoops + 1;
    }
        System.out.println("Looping complete.");
    }
}
