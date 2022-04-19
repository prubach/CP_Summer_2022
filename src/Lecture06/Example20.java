package Lecture06;
// For loop
// Infinite loop

public class Example20 {
 public static void main ( String[] args ) {
  int counter;
  counter = 1; // counter
  // it is always true so the loop is infinite
  for (;;) { // semicolons are mandatory
   System.out.println("Computer Programming");
   if (counter++>=5) break; // conditional, step and loop termination
  }
 }
}
