package Lecture03_04;
// Ternary Conditional Operator

public class Example19 {
 public static void main ( String[] args ) {
  int x = 2, y;
  y = (x == 1 ? 100 : 200); // parentheses are not necessary
  System.out.println("y = " + y);
  y = x == 2 ? 100 : 200;
  System.out.println("y = " + y);
 }
}
