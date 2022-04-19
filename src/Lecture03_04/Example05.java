package Lecture03_04;
// Char variables

public class Example05 {
 public static void main ( String[] args ) {
  char firstVariable;
  char secondVariable;
  // char thirdVariable;
  firstVariable = 'l';
  // treated as a single character - encoded with 2 characters in unicode
  secondVariable = 'ł'; // l with a slash
  // thirdVariable = 'las';
  System.out.println("first variable: " + firstVariable);
  System.out.println("second variable: " + secondVariable);
  // System.out.println("third variable: " + thirdVariable);
 }
}
