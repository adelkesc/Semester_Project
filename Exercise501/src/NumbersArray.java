//Use keyboard to store 10 integers into an array, then use a loop to print the
//array in reverse order

import java.util.Scanner;

public class NumbersArray
{
   public static void main(String[] args)
   {
      // Array declaration
      int[] numbers = new int[10];

      Scanner keyboard = new Scanner(System.in);

      // Display message
      System.out.println("Enter 10 integers:");

      // Collect user input
      for (int i = 0; i < 10; i++)
      {
         System.out.println("index: " + i);
         System.out.print("");
         numbers[i] = keyboard.nextInt();
      }

      // Print array in reverse order
      System.out.println("Reverse printing");
      for (int index = 10; index > 0; index--)
      {
         
         System.out.print(numbers[index-1] + " ");
      }
      keyboard.close();

   }
}
