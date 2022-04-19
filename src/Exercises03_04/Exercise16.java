package Exercises03_04;
// Write a program that asks to enter 3 numbers and checks if they have the same value

import java.util.Scanner;

public class Exercise16 {
 public static void main(String[] args) {
  int a, b, c;
  String result;
  Scanner giveNumber = new Scanner(System.in);
  System.out.print("Enter 1 number: ");
  a = giveNumber.nextInt();
  System.out.print("Enter 2 number: ");
  b = giveNumber.nextInt();
  System.out.print("Enter 3 number: ");
  c = giveNumber.nextInt();
  System.out.println(a +", " + b + ", "+ c); // only test
  result = a==b && b==c ? "same" : "different";
  System.out.println(result);
 }
}
