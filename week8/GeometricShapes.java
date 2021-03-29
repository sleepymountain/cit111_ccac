package com.asa;

import java.util.Scanner;

public class GeometricShapes {
    public static void main(String [] args){
        //create a scanner for user input
        Scanner geoScan = new Scanner(System.in);

        //Get user input for calculation of volume of cube
        System.out.println("Enter the side length of the cube to calculate it's volume: ");
        double inputSideLength = geoScan.nextDouble();

        //calc volume of cube and print output
        System.out.println("The volume of cube with a side length of: " + inputSideLength + " is " + calcVolumeOfCube(inputSideLength));

        //start cylinder calculations and user input
        System.out.println();
        System.out.println("Enter the radius of your cylinder:");
        double inputRadius = geoScan.nextDouble();
        System.out.println("Enter the height of your cylinder:");
        double inputHeight = geoScan.nextDouble();

        //calc volume of cyl and print output
        double finalCylVol = calcVolumeOfCylinder(inputRadius, inputHeight);
        System.out.println("The volume of your cylinder with a radius of " + inputRadius +  " and a height of " + inputHeight + " is: ");
        System.out.println(finalCylVol);

        //start pyramid calculations and user input, this is needed for the recent influx of illuminati shipments, our biggest customer
        System.out.println();
        System.out.println("Enter the base length of your pyramid:");
        double inputBaseLength = geoScan.nextDouble();
        System.out.println("Enter the base width of your pyramid:");
        double inputBaseWidth = geoScan.nextDouble();
        System.out.println("Enter the height of your pyramid:");
        double inputPyramidHeight = geoScan.nextDouble();

        //calc volume of pyramid and print output
        double finalPyramidVol = calcVolumeOfPyramid(inputBaseLength, inputBaseWidth, inputPyramidHeight);
        System.out.println("The volume of your pyramid with a base length of " + inputBaseLength + ", a base width of " + inputBaseWidth + ", and a height of " + inputPyramidHeight + " is: " + finalPyramidVol);
    }

    public static double calcVolumeOfCube(double sideLength){
        // raise side length to 3 and return the result
        double cubeVolume = Math.pow(sideLength, 3);

        // return the area
        return cubeVolume;
    }

    public static double calcVolumeOfCylinder(double radius, double height){
        final double pi = 3.1416;
        // V = pi * r^2 * h
        double cylVol = pi * (radius * radius) * height;
        return cylVol;
    }

    public static double calcVolumeOfPyramid(double length, double width, double height){
        // V = lwh/3
        double pyramidVolume = (length * width * height) / 3;
        return pyramidVolume;
    }
}
