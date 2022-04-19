package Exercises06;
// Write a program that prints out successive powers of numbers
// in the range <64, 100>. Use do while loop

public class Exercise17 {
 public static void main(String[] args) {
  int n = 64;
  do {
   System.out.print(n*n + " ");
   n++;
  } while (n <= 100);
 }
}
