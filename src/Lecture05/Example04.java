package Lecture05;
// Nesting of conditionals
// if else if

public class Example04 {
 public static void main ( String[] args ) {
  int a, b, c;
  a = 3;
  b = -3;
  c = 0;

  if (a>0) {
   System.out.println("a is positive");
  } else if (a==0) {
    System.out.println("a is equal to zero");
  } else {
    System.out.println("a is negative");
  }

  if (b>0) {
   System.out.println("b is positive");
  } else if (b==0) {
    System.out.println("b is equal to zero");
  } else {
    System.out.println("b is negative");
  }

  if (c>0) {
   System.out.println("c is positive");
  } else if (c==0) {
    System.out.println("c is equal to zero");
  } else {
    System.out.println("c is negative");
  }
  
 }
}
