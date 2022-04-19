package Lecture05;
// Conditional statement
// switch
// calculator

public class Example07 {
 public static void main ( String[] args ) {
  char operation;
  float result, a, b;
  operation = '+';
  // operation = '-';
  // operation = '*';
  // operation = ':';
  // operation = '/';
  a = 4;
  b = -3;
  result = 0;
  System.out.println("a = " + a);
  System.out.println("b = " + b);
  switch (operation) {
   case '+':
    result = a + b;
    break;
   case '-':
    result = a - b;
    break;
   case ':': 
   //case '/':
    result = a / b;
    break;
   case '*':
    result = a * b;
    break;
   default:
    System.out.println("INVALID OPERATOR");
    break;
  }
  System.out.println("result = " + result);
 }
}
