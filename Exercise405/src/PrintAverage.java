//Use template to write a program that reads 5 integers from the keyboard
//then calculates and prints the average.

import java.util.Scanner;

public class PrintAverage
{
   public static void main(String[] args)
   {  
      double sum = 0;
      double average = 0;
      
      //User input
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Type 5 integers: ");
     
      //Loop that collects 5 integers
      for (int index = 0; index < 5; index++)
      {         
         double value = keyboard.nextDouble();
      //Calculations to print the average   
         sum += value;
         average = sum / 5;
      }
      System.out.println("The average is: " + average);
      
      keyboard.close();
   }
}
