//Use an input validation loop to ask for a number between 10 and 25.

import java.util.Scanner;

public class WhileLoopValidation
{
   public static void main(String[] args)
   {      
      //Declared variable
      int number;
      
      //Requested input      
      System.out.print("Please enter a number in the range of 10 through 25: ");
      
      Scanner keyboard = new Scanner(System.in);
      number = keyboard.nextInt();
      
      //Input validation (I couldn't make it work because I was typing the
      //logic backwards)
      while (number < 10 || number > 25)
      {
         System.out.println("Invalid number");
         System.out.print("Please enter a new number: ");
         number = keyboard.nextInt();
      }
      keyboard.close();
   }
}
