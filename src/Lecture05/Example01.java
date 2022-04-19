package Lecture05;
// Conditional statement
// if

public class Example01 {
 public static void main ( String[] args ) {
  int a, b, c, d;
  a = 3;
  b = -3;
  c = 64;
  d = -64;

  if (a>0) System.out.println("a is positive");
  System.out.println("outside the conditional statement, a");
  
  if (b>0) System.out.println("b is positive");
  System.out.println("outside the conditional statement, b");
  
  if (c>0) {
   System.out.println("c is positive");
   System.out.println("inside a conditional block, c");
  }

  if (d>0) {
   System.out.println("d is positive");
   System.out.println("inside a conditional block, d");
  }

 }
}
