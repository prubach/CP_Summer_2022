package Lecture03_04;
// Overflow during compilation

public class Example14 {
 public static void main ( String[] args ) {
  short x;
  x = 32767;
  // x = 32768; // short type exceeded the range
  System.out.println("x = " + x);
 }
}
