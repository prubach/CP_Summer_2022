package Lecture05;
// Conditional statement
// if else

public class Example02 {
 public static void main ( String[] args ) {
  int a, b;
  a = 3;
  b = -3;

  // a >= 0 - this is a conditional expression
  if (a>=0) System.out.println("a is positive or equal to zero");
  // else - that is, if a < 0
  else System.out.println("a is negative");

  if (b>=0) System.out.println("b is positive or equal to zero");
  else System.out.println("b is negative");

 }
}
