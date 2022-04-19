package Exercises05;
// Write a program that converts English to Polish months. Use switch statement.

public class Exercise09 {
 public static void main(String[] args) {
  String month = "march";
  switch (month) {
   case "january": case "JANUARY": case "January":
    System.out.println(month + " is styczeń");
    break;
   case "february": case "FEBRUARY": case "February":
    System.out.println(month + " is luty");
    break;
   case "march": case "MARCH": case "March":
    System.out.println(month + " is marzec");
    break;
   // other months
   default:
    System.out.println("wrong name");
    break;
  }
 }
}
