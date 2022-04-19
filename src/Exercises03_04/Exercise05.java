package Exercises03_04;
// Write a program that calculates the gpa based on grades entered by the user and then displays it on the screen.

import java.util.Scanner;

public class Exercise05 {
 public static void main(String[] args) {
  Scanner giveDouble = new Scanner(System.in);
  double grade1, grade2, grade3, grade4, grade5;
  double gpa;
  System.out.print("Enter 1 grade: ");
  grade1 = giveDouble.nextDouble();
  System.out.print("Enter 2 grade: ");
  grade2 = giveDouble.nextDouble();
  System.out.print("Enter 3 grade: ");
  grade3 = giveDouble.nextDouble();
  System.out.print("Enter 4 grade: ");
  grade4 = giveDouble.nextDouble();
  System.out.print("Enter 5 grade: ");
  grade5 = giveDouble.nextDouble();
  gpa = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
  System.out.println("GPA is: " + gpa);
 }
}
