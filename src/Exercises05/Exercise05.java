package Exercises05;
// Write a program that checks for the three sides of the triangle (> 0) whether they form a rectangular triangle

public class Exercise05 {
 public static void main(String[] args) {
  int a = 4;
  int b = 5; // 5 or 6
  int c = 3; // 3 or -3
  if ( a > 0 && b > 0 && c > 0 ) {
   if ( a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a ) {
    System.out.println("a rectangular triangle");
   } else {
    System.out.println("it is NOT a rectangular triangle");
   }
  } else {
   System.out.println("incorrect sides");
  }
 }
}
