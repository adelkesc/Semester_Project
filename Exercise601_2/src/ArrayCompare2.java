import java.util.Arrays;
import java.util.Scanner;

public class ArrayCompare2
{
   public static void main(String[] args)
   {
      int[] array1 = new int[4];
      int[] array2 = new int[4];
      
      Scanner keyboard = new Scanner(System.in);
      
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
      
//      *Swapping elements in an array*
//      int temp = array2[0];
//      array2[0] = array2[3];
//      array2[3] = temp;
//      
//      System.out.println("Arrays #1: " + Arrays.toString(array1));
//      System.out.println("Array #2: " + Arrays.toString(array2));
      
      int lowest = array2[0];
      for (int index = 1; index < array2.length; index++)
      {
         if(array2[index] < lowest)
            lowest = array2[index];
         
         int temp = array2[0];
         array2[0] = array2[3];
         array2[3] = temp;
      }
      
      System.out.println("Arrays #1: " + Arrays.toString(array1));
      System.out.println("Array #2: " + Arrays.toString(array2));
      
      keyboard.close();
   }
}
