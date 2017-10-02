//Store the identification numbers of 10 employees as integers
//Store their weekly gross pay amounts as double values

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmWorkbench5
{
   public static void main(String[] args)
   {
      int[] idNumber = new int[10];
      double[] grossPay = new double[10];
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter Id: ");
      
      for(int idArray = 0; idArray < 10; idArray++)
      {
       idNumber[idArray] = keyboard.nextInt(); //Storing 10 integers
      }
      
      System.out.println("Enter Weekly Gross Pay: ");
      
      for(int payArray = 0; payArray < 10; payArray++)
      {
       grossPay[payArray] = keyboard.nextDouble(); //Storing 10 pay amounts
      }
      
      System.out.println(Arrays.toString(idNumber));
      System.out.println(Arrays.toString(grossPay));
      
   keyboard.close();   
   }
}
