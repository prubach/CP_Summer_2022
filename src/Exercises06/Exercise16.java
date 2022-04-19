package Exercises06;
// Write a program that sums the values of integers in the range <1, 99>.
// Use while loop

public class Exercise16 {
 public static void main(String[] args) {
  int number = 1, sum = 0;
  while (number <= 99) {
   sum = sum + number;
   number++;
  }
  System.out.println(sum); // 4950
 }
}
