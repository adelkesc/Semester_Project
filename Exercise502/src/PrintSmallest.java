import java.util.Scanner;

public class PrintSmallest
{
   public static void main(String[] args)
   {
      //Declare array
      double[] numbers = new double[7];
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter a number:");
      
      //Collect user input for array
      for(int value = 0; value < 7; value++)
      {
         numbers[value] = keyboard.nextDouble();
      }
      
      double lowest = numbers[0];
      for(int value = 1; value < numbers.length; value++)
      {
         if (numbers[value] < lowest)
            lowest = numbers[value];
      }
      System.out.print("Lowest number: " + lowest);
      
      keyboard.close();
   }
}
