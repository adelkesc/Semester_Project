//Write a program that reads integers from a keyboard and saves them to an array.
//Write a method that locates the second largest value in the array and prints it.

import java.util.Scanner;

public class SecondLargest
{
   public static void main(String[] args)
   {  
      //Made the array
      int[] numbers = new int[5];
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter Integers: ");
      
      int largest = numbers[0];
      int secondLargest = numbers[1];
      
      //Collects numbers for array
      for(int index = 0; index < numbers.length; index++)
      {
      numbers[index] = keyboard.nextInt();
           
         //If else statement for finding the second largest number?
         //Started with the if statement for finding the largest number...
         if(numbers[index] > largest)  
         {
            secondLargest = largest;
            largest = numbers[index];
         }
         else if(numbers[index] > secondLargest)
         {
            secondLargest = numbers[index];
         }
      }
      
      System.out.println("The second largest integer is: " + secondLargest);
      keyboard.close();
   }
}
