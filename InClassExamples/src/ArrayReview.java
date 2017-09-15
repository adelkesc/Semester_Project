
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
   }
}
