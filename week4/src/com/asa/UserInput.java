package com.asa;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        final double SALES_TAX = 0.07;
        double salePrice;
        double priceWithTax;

        Scanner userInputScanner = new Scanner(System.in);

        System.out.println("Enter the sale price (no $) and press enter:");
        salePrice = userInputScanner.nextDouble();
        priceWithTax = salePrice * (1 + SALES_TAX);
        System.out.println("Your item price + 7% tax: $" + priceWithTax);
    }
}
