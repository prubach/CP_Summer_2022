package Exercises03_04;
// Write a program that adds together two variables (a and b) with values:
// a = 2 147 483 647,
// b = 2 147 483 648.

public class Exercise06 {
 public static void main(String[] args) {
  int a = 2_147_483_647;
  long b = 2_147_483_648L;
  long result = a + b;
  System.out.println("Result (a+b): " + result);
 }
}
