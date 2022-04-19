package Lecture05;
// Conditional statement
// switch

public class Example06 {
 public static void main ( String[] args ) {
  int a;
  a = 1;
  // a = 9;
  // a = 3;

  switch (a) {
  case 1:
   System.out.println("a is 1");
   break;
  case 2:
   System.out.println("a is 2");
   break;
  case 3:
   System.out.println("a is 3");
   break;
  default:
   System.out.println("variable takes value other than 1, 2, 3");
   break;
  }

 }
}
