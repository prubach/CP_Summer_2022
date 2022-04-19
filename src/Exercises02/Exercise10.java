package Exercises02;// Prepare an interview program for the patient
// (name, surname, weight, height, age)
// and display this data in a formatted manner
import java.util.Scanner;

public class Exercise10 {
 public static void main (String[] args) {
  Scanner patient = new Scanner(System.in);
  System.out.print("Enter first name: ");
  String firstName = patient.next();
  System.out.print("Enter last name: ");
  String lastName = patient.next();
  System.out.print("Enter weight: ");
  int weight = patient.nextInt();
  System.out.print("Enter height: ");
  int height = patient.nextInt();
  System.out.print("Enter age: ");
  int age = patient.nextInt();

  // Concatenation
  String name = firstName + " " + lastName;

  // Print the results (table)  
  System.out.println(" ------------------------------- ");
  System.out.println("| patient: " + name + "   |");
  System.out.println(" ------------------------------- ");
  System.out.println("| weight:     " + weight + "         \t|");
  System.out.println("| height:     " + height + "         \t|");
  System.out.println("| age:        " + age + "         \t|");
  System.out.println(" ------------------------------- ");
 }
}
