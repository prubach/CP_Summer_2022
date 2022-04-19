package Lecture05;
// Errors in the switch statement

public class Example08 {
 public static void main ( String[] args ) {
  int number, variable;
  number = 1;
  // number = 2;
  // number = 3;
  // number = 4;
  variable = 0;
  switch (number) {
   case 1: case2: case3: variable=1; break; // errors 
   // case 1: case 2: case 3: variable=1; break;
   case 4: variable=12; // the absence of a break statement causes default to be executed
   default: variable=10; // no need to add break at the end, but this is a good practice
  }
  System.out.println("number = " + number);
  System.out.println("variable = " + variable);
 }
}
