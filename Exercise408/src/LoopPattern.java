//Make a decrementing * pattern starting at 7 *

public class LoopPattern
{
   public static void main(String[] args)
   {
      final int BaseSize = 0;
      
      for (int row = 7; row > BaseSize; row--)
      {
         for (int column = 0; column < row; column++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
      
   }
}
