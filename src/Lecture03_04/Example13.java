package Lecture03_04;
// Integer division

public class Example13 {
 public static void main ( String[] args ) {
  int x, y, z;
  x = 8;
  y = 3;
  z = 2;
  System.out.println("x = " + x);
  System.out.println("y = " + y);
  System.out.println("z = " + z);
  System.out.println("x / y = " + x / y); // loss of precision
  System.out.println("x / z = " + x / z); // the result is an integer
  System.out.println("y / z = " + y / z); // loss of precision
 }
}
