package Exercises05;
// Print the largest of the four numbers provided

public class Exercise04 {
 public static void main(String[] args) {
  int a = 4;
  int b = 5;
  int c = 3;
  int d = 1;
  int max;
  if (a > b) max = a;
  else max = b;
  if ( c > max) max = c;
  if ( d > max) max = d;
  System.out.println("for values: " + a + ", " + b + ", " + c + ", " + d + " max is: " + max);    
 }
}
