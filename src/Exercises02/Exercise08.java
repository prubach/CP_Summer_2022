package Exercises02;// Write a program that prompts you for your name and displays it with message
import java.util.Scanner;

public class Exercise08 {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Write your name: ");
  String name = input.next();
  System.out.print("Hello " + name + "! \n");
 }
}
