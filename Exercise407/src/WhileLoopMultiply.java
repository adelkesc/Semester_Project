//Multiply by 10 and increment until 100

import java.util.Scanner;

public class WhileLoopMultiply
{
   public static void main(String[] args)
   {
       //Declared variables
      double number;
      double product;
      int multiply = 10;
      
      //Declaring method of and collecting user input
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print("Please enter a number: ");
      number = keyboard.nextInt();
      
      //Multiplication by 10
      product = number * multiply;
      
      while (product < 100)
      {
         System.out.println("The product is: " + product);
         product++;
      }
      keyboard.close();
   }
}
