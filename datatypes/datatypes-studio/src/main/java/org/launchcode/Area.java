package org.launchcode;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double radius;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        while (input.nextDouble() < 0) {
            System.out.println("Enter a radius:");
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is " + area);
            } else {
                System.out.println("error, that's not a valid radius");
            }
        }
        input.close();




    }

}
