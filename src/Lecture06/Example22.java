package Lecture06;
// Continue statement
// Numbers divisible by 3

public class Example22 {
 public static void main ( String[] args ) {
  for (int counter=1;counter<=30;counter++) {
   if (counter%3!=0) continue;
   System.out.println(counter);
  }
 }
}
