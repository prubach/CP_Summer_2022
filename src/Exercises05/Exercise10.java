package Exercises05;
// Write a program that prints on the screen
// a random message from the pool of 10 texts.

public class Exercise10 {
 public static void main(String[] args) {
  int draw = (int)(Math.random() * 10); // random is <0, 1) (double)
  switch(draw) {
   case 0: System.out.println("First sentence."); break;
   case 1: System.out.println("Second sentence."); break;
   case 2: System.out.println("3 sentence."); break;
   case 3: System.out.println("4 sentence."); break;
   case 4: System.out.println("5 sentence."); break;
   case 5: System.out.println("6 sentence."); break;
   case 6: System.out.println("7 sentence."); break;
   case 7: System.out.println("8 sentence."); break;
   case 8: System.out.println("9 sentence."); break;
   case 9: System.out.println("10 sentence."); break;
  }
 }
}
