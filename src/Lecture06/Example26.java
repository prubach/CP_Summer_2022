package Lecture06;
// For loop
// Prefix and postfix operator

public class Example26 {
 public static void main ( String[] args ) {
  int counter;
  System.out.println("counter++");
  // postfix - read then increment
  for (counter=1;counter++<=10;) System.out.println(counter);
  System.out.println("++counter");
  // prefix - increment then read
  for (counter=1;++counter<=10;) System.out.println(counter);
 }
}
