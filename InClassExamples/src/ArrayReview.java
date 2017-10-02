import java.util.Arrays;

public class ArrayReview
{
   public static void main(String[] args)
   {
      int[] array1 = new int[25];
      for (int i = 0; i < array1.length; i++)
      {
         array1[i] = 2 * i;
      }

      for (int number : array1)
      {
         System.out.print(number + " ");
      }
      
      //Telling the main method to go to another method.
      printwithArraysClass(array1);
      printwithEnhanced(array1);
         
   }//End of main method braces.
   
   //Beginning of new method.
   private static void printwithArraysClass(int[] array1)
   {
      System.out.println("Printing with Arrays class");
      System.out.println(Arrays.toString(array1));
   }
   
   //Beginning of another method.
   private static void printwithEnhanced(int[] array1)
   {
      System.out.println("Printing with Enhanced For Loop");
      for(int i : array1)
      {
         System.out.print(i + " ");
      }
   }
   
//End brace which closes the class.   
}
