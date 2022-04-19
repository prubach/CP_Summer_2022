package Lecture03_04;
// Bitwise operators

public class Example16 {
 public static void main ( String[] args ) {
  int x = 0x0010, y;
  y = x << 2; // shift to the left
  System.out.println("x = " + x);
  System.out.println("y = " + y);
  // x = 0000 0000 0001 0000 // 16 // 0x0010
  // y = 0000 0000 0100 0000 // 64 // 0x0040

  x = 0x0010;
  System.out.printf("x = %#x\n",x);
  // x = 0000 0000 0001 0000 // 16 // 0x0010

  x = x << 2; 
  System.out.printf("x = %#x\n",x);
  // x = 0000 0000 0100 0000 // 64 // 0x0040
  // multiplication by 4 (2^2)
 }
}
