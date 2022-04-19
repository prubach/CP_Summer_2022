package Exercises05;
// Ask for the water temperature. Check if it is in a liquid state.

import java.util.Scanner;

public class Exercise02 {
 public static void main(String[] args) {
  Scanner giveTemp = new Scanner(System.in);
  System.out.print("Enter the water temp.: ");
  int water = giveTemp.nextInt();
  if (water > 0 && water < 100) {
   System.out.println("liquid state");
  } else {
   System.out.println("different state");
  }
 }
}
