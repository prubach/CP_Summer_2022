package Exercises06;
// Print out one year by week and month on the screen. Use do while loop

public class Exercise14 {
 public static void main(String[] args) {
  // simpler version: year by month (without breaking it by week)
  int day = 1, month = 1, numberOfDays = 30;
  do {
   // print out months
   // System.out.println(month);
   switch (month) {
    case 1:
     System.out.println("January");
     break;
    case 2:
     System.out.println("February");
     break;
    case 3:
     System.out.println("March");
     break;
    case 4:
     System.out.println("April");
     break;
    case 5:
     System.out.println("May");
     break;
    case 6:
     System.out.println("June");
     break;
    case 7:
     System.out.println("July");
     break;
    case 8:
     System.out.println("August");
     break;
    case 9:
     System.out.println("September");
     break;
    case 10:
     System.out.println("October");
     break;
    case 11:
     System.out.println("November");
     break;
    case 12:
     System.out.println("December");
     break;
   }

   // switch number of days
   switch (month) {
    case 2:
     numberOfDays = 28;
     break;
    case 4:
    case 6:
    case 9:
    case 11:
     numberOfDays = 30;
     break;
    default:
     numberOfDays = 31;
     break;
   }

   // print out days
   day = 1;
   do {
    System.out.print(day + " ");
    day++;
   } while (day <= numberOfDays);
   System.out.println();
   month++;
  } while (month <= 12);
 }
}
