package Lecture06;
// Loop with a condition that is false

public class Example15 {
 public static void main ( String[] args ) {
  int q;
  q = 100;
  while (q++<=50) {
   System.out.println("The condition is false, loop will NOT work!");
  } 
  System.out.println(q);
  do {
   System.out.println("The condition is false, but loop will work ONCE!");
  } while (q++<=50);
  System.out.println(q);
 }
}
