package Exercises03_04;
// Perform the multiplication, division, and power of numbers: 8 and 4 by using the bitwise operators

public class Exercise17 {
 public static void main(String[] args) {
  int number = 8, result;
  // multiplication
  result = number << 2;
  System.out.println("8*4 (8 << 2), result is: " + result);
  // division
  result = number >> 2;
  System.out.println("8/4 (8 >> 2), result is: " + result);
  // power
  // 8 * 8 * 8 * 8 -> (3+3+3) -> 9
  result = number << (3+3+3);
  System.out.println("8<<9, result is: " + result);
 }
}
