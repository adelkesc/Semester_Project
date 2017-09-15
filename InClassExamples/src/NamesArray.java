import java.util.Scanner;

public class NamesArray
{
   public static void main(String[] args)
   {
      //Number of names
      final int NAME_NUMBER = 20; 
      
      //Array to hold names
      int[] names = new int[NAME_NUMBER];
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter a name: ");
      
      for(int index = 0; index < NAME_NUMBER; index++)
      {
         System.out.print("");
         names[index] = keyboard.nextInt();
      }
      keyboard.close();
      
   }
}
