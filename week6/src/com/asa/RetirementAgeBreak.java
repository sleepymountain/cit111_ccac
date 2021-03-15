package com.asa;
import java.util.Scanner;

public class RetirementAgeBreak {
    public static void main(String[] args){
        //Create integer for age and scanner asking for user input
        int age;
        int money;
        int minSaved = 15000;
        Scanner inputScanner = new Scanner(System.in);
        Scanner moneyScanner = new Scanner(System.in);

        //infinite loop until break
        while(true){
            System.out.println("Enter your age:");
            age = inputScanner.nextInt();
            System.out.println("How much money did you save?");
            money = moneyScanner.nextInt();
            if(age > 65.5 & money>=minSaved){
                System.out.println("You can retire!");
            } else if (age<0) {
                break;
            } else {
                System.out.println("Keep working :(");
            }
        }
    }
}
