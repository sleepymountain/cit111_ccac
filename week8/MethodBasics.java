package com.asa;

public class MethodBasics {

    // Method I
    public static void displayPattern(){
        System.out.println("X**X*");
        System.out.println("*X**X");
        System.out.println("**X**");
        System.out.println("X**X*");
    }

    // Method II
    public static void displayPriceWithTax(double price){
        final double TAX_RATE = 0.075;
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    }

    // Method III
    public static double computePriceWithTax(double price){
        final double TAX_RATE = 0.07;
        double totalPrice = price * ( + TAX_RATE);
        return totalPrice;
    }

    public static void main(String[] args) {
        //Method I
        System.out.println();
        System.out.println("Method I");
        displayPattern();

        //Method II
        System.out.println();
        System.out.println("Method II");
        final double ITEM_PRICE = 100.00;
        System.out.println("$" + ITEM_PRICE);
        displayPriceWithTax(ITEM_PRICE);

        //Method III
        System.out.println();
        System.out.println("Method III");
        //final double ITEM_PRICE = 100.00;
        System.out.println("$" + ITEM_PRICE);
        double result = computePriceWithTax(ITEM_PRICE);
    }
}
