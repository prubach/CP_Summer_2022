package Exercises05;
// Write a program that asks for a grade (scale from 2 to 5),
// and then prints one of the messages:
// "unsatisfactory", "satisfactory", "good", "very good".

import java.util.Scanner;

public class Exercise06 {
 public static void main(String[] args) {
  Scanner giveGrade = new Scanner(System.in);
  System.out.print("Enter grade: ");
  int grade = giveGrade.nextInt();
  switch (grade) {
   case 2: System.out.println("unsatisfactory"); break;
   case 3: System.out.println("satisfactory"); break;
   case 4: System.out.println("good"); break;
   case 5: System.out.println("very good"); break;
   default: System.out.println("wrong grade"); break;
  }
 }
}
