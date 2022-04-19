package Exercises06;
// Write a program that prints on the screen even numbers between 64 and 99

public class Exercise12 {
 public static void main(String[] args) {
  for (int i = 64; i <= 99; i++) {
   if (i%2!=0) continue;
   System.out.print(i + " "); // or System.out.println(i);
  }
 }
}
