package Exercises06;
// Prepare the multiplication table (10x10) using nested loops

public class Exercise18 {
 public static void main(String[] args) {
  for (int i=1; i<=10; i++) {
   for (int j=1; j<=10; j++) {
    System.out.print(i*j + "\t");
   }
   System.out.println("");
  }
 }
}
