package Lecture06;
// Loop nesting

public class Example25 {
 public static void main ( String[] args ) {
  int counter, nestedCounter;

  // the result is matrix
  for (counter=1;counter<=10;counter++) {
   System.out.print(counter);
   for(nestedCounter=10;nestedCounter>0;nestedCounter--) {
    System.out.print(" " + nestedCounter);
   }
   System.out.println();
  }

 }
}
