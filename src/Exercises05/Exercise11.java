package Exercises05;
// Using if else if calculate the roots of the quadratic equation

import java.util.Scanner;

public class Exercise11 {
 public static void main(String[] args) {

  // data input
  Scanner giveValue = new Scanner(System.in);
  System.out.println("Equation is: a*x2 + b*x + c = 0");
  System.out.print("Enter a: ");
  float a = giveValue.nextFloat();
  System.out.print("Enter b: ");
  float b = giveValue.nextFloat();
  System.out.print("Enter c: ");
  float c = giveValue.nextFloat();

  // checking if it is a quadratic equation
  if (a==0) {
   System.out.println("This is NOT a quadratic equation.");
   System.exit(0);
  }

  // calculations
  double delta, x1, x2;
  delta = (b * b) - 4 * a * c;
  // System.out.println(delta); // test only

  // delta conditions
  if (delta < 0) System.out.println("no solutions");
  else if (delta == 0) {
   x1 = (-b - Math.sqrt(delta)) / (2 * a);        
   System.out.printf("one solution; x = %5.2f \n", x1);
  } else {
   x1 = (-b - Math.sqrt(delta)) / (2 * a);
   x2 = (-b + Math.sqrt(delta)) / (2 * a);
   System.out.printf("first solution; x1 = %5.2f \n",x1);
   System.out.printf("second solution; x2 = %5.2f \n",x2);
  }
 }
}
