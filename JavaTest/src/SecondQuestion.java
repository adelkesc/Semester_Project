import java.util.Scanner;

public class SecondQuestion
{
   public static void main(String[] args)
   {
      
      int[] array = new int[4];
            
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter 4 integers: ");
      
      for(int index = 0; index < 4; index++)
      {
         array[index] = keyboard.nextInt();
      }
      
      for(int index = 0; index < 4; index++)
      {
         System.out.print(array[index] + " ");
      }
   }
}
