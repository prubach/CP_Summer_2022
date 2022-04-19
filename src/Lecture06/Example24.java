package Lecture06;
// Comparison of for and while loops

public class Example24 {
 public static void main ( String[] args ) {
  int counter;

  // for
  System.out.println("Pętla FOR:");
  for (counter=1;counter<4;counter=counter+1) System.out.println("This iS a FOR loop.");

  // while
  System.out.println("Pętla WHILE:");
  counter = 1;
  while (counter<4) {
   System.out.println("This is a WHILE loop.");
   counter = counter + 1;
  }
 }
}
