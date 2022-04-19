package Exercises02;// Write a program that prompts you for an integer and displays it with a message
import java.util.Scanner;

public class Exercise07 {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Write a number: ");
  int number = input.nextInt();
  System.out.print("You typed number: " + number + "\n");
 }
}
