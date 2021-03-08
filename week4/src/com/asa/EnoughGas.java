package com.asa;

import java.util.Scanner;

public class EnoughGas {
    public static void main(String[] args) {
        int STANDARD_MPG = 28;
        int GALLONS_LEFT;
        int MILES_TO_STATION;
        int MPG_CALC;


        Scanner EnoughGasScanner = new Scanner(System.in);
        System.out.println("How many gallons of gas remain in your tank?");
        GALLONS_LEFT = EnoughGasScanner.nextInt();

        System.out.println("How many miles to the next service station?");
        MILES_TO_STATION = EnoughGasScanner.nextInt();

        MPG_CALC = GALLONS_LEFT * STANDARD_MPG;

        if(MPG_CALC >= MILES_TO_STATION){
            System.out.println("Whew! You'll make it to the next station!");
        } else {
            System.out.println("Red Alert! You'll soon be marooned. Sucker!");
        }
    }
}
