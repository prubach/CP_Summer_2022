package Exercises03_04;
// Write a program that computes the area of a rectangle based on the variables initialized in the program.
// Use an integer type and then a floating point type.

public class Exercise03 {
 public static void main(String[] args) {
  // version 1 (int)
  int sideOne = 3, sideTwo = 5, rect;
  rect = sideOne * sideTwo;
  System.out.println("field: " + rect);
  // version 2 (double)
  double sideA = 3.5, sideB = 1.1, rectangle;
  rectangle = sideA * sideB; // optimization of calculations at the expense of approx. values
  System.out.println("field: " + rectangle);
 }
}
