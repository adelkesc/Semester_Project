//Create 2 arrays that each store 4 integers and use a loop to check if all 
//elements within the array are identical.
import java.util.Scanner;

public class ArrayCompare
{
   public static void main(String[] args)
   {
      // Declare arrays
      int[] array1 = new int[4];
      int[] array2 = new int[4];

      Scanner keyboard = new Scanner(System.in);

      // Collect user input for both arrays using for loop
      System.out.println("Please enter 4 digits: ");
      for (int index1 = 0; index1 < 4; index1++)
      {
         array1[index1] = keyboard.nextInt();
      }

      System.out.println("Please enter 4 more digits: ");
      for (int index2 = 0; index2 < 4; index2++)
      {
         array2[index2] = keyboard.nextInt();
      }
      
      //Establish boolean statement
      boolean arraysEqual = true;
      int equal = 0;

      // Determine if arrays are the same length
      if (array1.length != array2.length)
         arraysEqual = false;

      // Determine if arrays contain the same data
      while (arraysEqual && equal < array1.length)
      {
         if (array1[equal] != array2[equal])
            arraysEqual = false;
         equal++;
      }
      if (arraysEqual)
         System.out.println("The arrays are equal.");
      else
         System.out.println("The arrays are not equal.");

      keyboard.close();
   }
}
