import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidationCheck
{

   public static void main(String[] args)
   {
      int[] valid = new int[5]; 
      
      Scanner keyboard = new Scanner(System.in);

      for(int index = 0; index < 5; index++)
      {
        try 
        {
           System.out.print("Type an integer in the range of 10-99: ");
           int input = keyboard.nextInt(); //variable to store number for if statement to check.
         
           if (input <= 10 || input >= 99)
           {
              throw new InputMismatchException("The input is not an integer in the range of 10 through 99, try again: ");
//              System.out.println("The input is not an integer in the range of 10 through 99, try again: ");
           }
           valid[index] = input;  //places index values into input variable to be checked.
        }
        
         catch (java.util.InputMismatchException ime)
        {
            keyboard.nextLine();
            System.out.println("The input is not an integer in the range 10-99, try again: ");
            index--;
        }
      }
      System.out.println("Program successfully ended!");

   
      
      keyboard.close();
   }

}
