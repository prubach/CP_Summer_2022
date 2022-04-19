package Exercises05;
// Write a program that asks for a grade (scale from 2 to 5),
// and then prints a message: 
// "you passed" (for grades 3-5),  
// "you failed" (for grade 2).

import java.util.Scanner;

public class Exercise07 {
 public static void main(String[] args) {
  Scanner giveGrade = new Scanner(System.in);
  System.out.print("Enter grade: ");
  int grade = giveGrade.nextInt();
  switch (grade) {
   case 3: case 4: case 5:
    System.out.println("U passed");
    break;
   case 2:
    System.out.println("U failed");
    break;
   default:
    System.out.println("wrong grade");
    break;
  }
 }
}
