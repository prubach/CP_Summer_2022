package Exercises05;
// Ask for the temperature outside the window and write if it is frost today

import java.util.Scanner;

public class Exercise01 {
 public static void main(String[] args) {
  Scanner giveTemp = new Scanner(System.in);
  System.out.print("Enter the temperature: ");
  int temp = giveTemp.nextInt();
  if (temp < 0) System.out.println("FROST");
 }
}
