package Exercises05;
// Write a program asking for the color of the car's paintwork,
// which then checks if we have this color
// and gives the price of painting the car in this color.
// Assume we have 5 colors.

import java.util.Scanner;

public class Exercise08 {
 public static void main(String[] args) {
  Scanner giveColor = new Scanner(System.in);
  System.out.print("Enter color: ");
  String colorOfCar = giveColor.next();
  colorOfCar = colorOfCar.toLowerCase(); // to ignore case-sensitive
  switch (colorOfCar) {
   case "red":
    System.out.println("$200");
    break;
   case "green":
    System.out.println("$300");
    break;
   case "blue":
    System.out.println("$400");
    break;
   case "orange":
    System.out.println("$500");
    break;
   case "black":
    System.out.println("$600");
    break;
   default:
    System.out.println("no such color");
    break;
  }
 }
}
