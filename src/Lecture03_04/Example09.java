package Lecture03_04;
// Standard Mathematical Operators
// Division for int and float types

public class Example09 {
 public static void main ( String[] args ) {
  int x, y, result;
  double fx, fy, fresult;
  x = 2;
  y = 5;
  System.out.println("x = " + x);
  System.out.println("y = " + y);
  result = x + y;
  System.out.println("addition: x + y = " + result);
  result = x - y;
  System.out.println("subtraction: x - y = " + result);
  result = x * y;
  System.out.println("multiplication: x * y = " + result);
  result = x / y;
  System.out.println("division: x / y = " + result);
  fresult = x / y;
  System.out.println("\ndivision (int/int=float): x / y = " + fresult + "\n");
  fx = 2;
  fy = 5;
  fresult = fx / fy;
  System.out.println("fx = " + x);
  System.out.println("fy = " + y);
  System.out.println("division (float/float=float): fx / fy = " + fresult);
 }
}
