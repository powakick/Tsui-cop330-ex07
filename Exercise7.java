/*
UCF COP3330 FALL 2021 ASSIGNMENT 7 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){

        int length, width, area;
        double meters;

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        length = scan.nextInt();

        System.out.println("What is the width of the room in feet?");
        width = scan.nextInt();

        System.out.println("you entered the dimensions of " + length + " feet by " + width + " feet.");

        area = length * width;
        meters = area * .09290304;

        System.out.println("The area is ");
        System.out.println(area + " square feet");
        System.out.println(meters + " square meters");

    }
}
