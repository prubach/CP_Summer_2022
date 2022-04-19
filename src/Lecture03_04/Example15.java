package Lecture03_04;
// Overflow during runtime

public class Example15 {
 public static void main ( String[] args ) {
  int x, result;
  x = (int) Math.pow(2, 32); // maximum integer
  System.out.println("x = " + x);
  result = x + x; // overflow
  x = x + 1; // overflow
  System.out.println("x + 1 = " + x);
  System.out.println("x + x = " + result);
 }
}
