package com.asa;

import java.util.Scanner;

public class IfControl {
    public static void main(String[] args) {
        final double PURCHASE_LIMIT = 200.00;
        double purchaseAmount;

        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Enter the amount of the purchase (no $) and press enter:");
        purchaseAmount = userInputScanner.nextDouble();

        if(purchaseAmount > PURCHASE_LIMIT){
            System.out.println("That's too expensive! Buy something else");
        } else {
            System.out.println("Okay, you can purchase this item for: $" + purchaseAmount);
        }
    }
}
