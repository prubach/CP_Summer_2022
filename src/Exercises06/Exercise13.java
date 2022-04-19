package Exercises06;
// Print out one month by week on the screen. Use while loop

public class Exercise13 {
 public static void main(String[] args) {
  int day = 1;
  while (day <= 30) {
   System.out.print(day + "\t");
   if (day%7==0) System.out.println();
   day++;
  }
  System.out.println("");
 }
}
