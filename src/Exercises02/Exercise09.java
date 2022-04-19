package Exercises02;// Write a program to do a shopping list for 5 products
import java.util.Scanner;

public class Exercise09 {
 public static void main (String[] args) {
  Scanner getPrice = new Scanner(System.in);
  System.out.print("Enter the price of 1 item: ");
  int item1 = getPrice.nextInt();
  System.out.print("Enter the price of 2 item: ");
  int item2 = getPrice.nextInt();
  System.out.print("Enter the price of 3 item: ");
  int item3 = getPrice.nextInt();
  System.out.print("Enter the price of 4 item: ");
  int item4 = getPrice.nextInt();
  System.out.print("Enter the price of 5 item: ");
  int item5 = getPrice.nextInt();

  // Calculations
  int sum = item1 + item2 + item3 + item4 + item5;

  // Print the results (table)  
  System.out.println("*********************************");
  System.out.println("* Item      * Price             *");
  System.out.println("*********************************");
  System.out.println("* item 1    * " + item1 + "         \t*");
  System.out.println("* item 2    * " + item2 + "         \t*");
  System.out.println("* item 3    * " + item3 + "         \t*");
  System.out.println("* item 4    * " + item4 + "         \t*");
  System.out.println("* item 5    * " + item5 + "         \t*");
  System.out.println("*********************************");
  System.out.println("* Total     * " + sum + "         \t*");
  System.out.println("*********************************");
 }
}
