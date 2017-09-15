//Make a decrementing * pattern starting at 7 *

public class LoopPattern
{
   public static void main(String[] args)
   {
      final int BaseSize = 0;
      
      for (int r = 7; r > BaseSize; r--)
      {
         for (int c = 7; c > (r-1); c--)
         {
            System.out.print("*");
         }
         System.out.println();
      }
      
   }
}
