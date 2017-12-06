import java.util.Scanner;

public class TryCatchSum
{

   public static void main(String[] args)
   {
      boolean end = false;
      String numberString = "";
      int totalNumber = 0; // accumulator
      int counter = 0;

      Scanner keyboard = new Scanner(System.in);

      while (!end)
      {

         System.out.print("Type an integer: ");
         numberString = keyboard.nextLine();
         // throw new InputMismatchException("The input is not an integer, try
         // again");

         // System.out.println("Type an integer: ");
         // number = keyboard.nextInt();
         try
         {

            int numberInt = Integer.parseInt(numberString);

            totalNumber += numberInt;
            counter ++;

//            if (end)
//            {
//               System.out.println(totalNumber);
//            }
         }

//         catch (java.util.InputMismatchException ime)
//         {
//            System.out.println("The input is not an integer, try again.");
//            keyboard.nextLine();
//         }

         catch (java.lang.NumberFormatException nfe)
         {
            if (numberString.equals("end"))
            {
               end = true;
               System.out.println("The sum of the " + counter + " integers is: " + totalNumber);
            }
            else
            {
               System.out.println("The input is not an integer, try again");
              // keyboard.nextLine();
            }
         }

      }
//      System.out.println("The sum of the integers is: " + totalNumber);

      keyboard.close();
   }

}
