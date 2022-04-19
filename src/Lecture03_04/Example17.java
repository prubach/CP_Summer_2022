package Lecture03_04;
// Math operators together with assignment

public class Example17 {
 public static void main ( String[] args ) {
  int a,b,c;
  a = 2;
  b = 4;
  c = 6;
  System.out.printf("c = %d, a = %d, ", c, a);
  c += a;
  System.out.printf("c += a, c = %d \n", c); // c = 8
  System.out.printf("c = %d, a = %d, ", c, a);
  c -= a;
  System.out.printf("c -= a, c = %d \n", c); // c = 6
  System.out.printf("c = %d, a = %d, ", c, a);
  c *= a;
  System.out.printf("c *= a, c = %d \n", c); // c = 12
  System.out.printf("c = %d, a = %d, ", c, a);
  c /= a;
  System.out.printf("c /= a, c = %d \n", c); // c = 6
  System.out.printf("c = %d, b = %d, ", c, b);
  c %= b;
  System.out.printf("c %%= b, c = %d \n", c); // c = 2
  System.out.printf("c = %d, a = %d, ", c, a);
  c *= ++a + 3;
  System.out.printf("c *= ++a + 3, c = %d \n", c); // c = 12
 }
}
