package com.company;

import java.util.Scanner;

public class GreetingMachine { public static
void main(String[] args) {
    System.out.println("Please enter your name and press enter"); Scanner scan
            = new Scanner(System.in); String name
            = scan.next();
    System.out
            .println("Whoa, " + name + " What an interesting name card you have!"); } }
// close class GreetingMachine
