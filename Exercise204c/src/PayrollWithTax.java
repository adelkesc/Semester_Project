import java.util.Scanner;  //Needed for the Scanner class.

/**
 *    This program demonstrates the Scanner class.
 */

public class PayrollWithTax
{
   public static void main(String[] args)
   {
      String name;
      int hours;
      double payRate;
      double taxRate;
      double grossPay;
      double netPay;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("What is your name? ");
      name = keyboard.nextLine();
      
      System.out.print("What are your hours did you work this week? ");
      hours = keyboard.nextInt();
      
      System.out.print("What is your hourly payrate? ");
      payRate = keyboard.nextDouble();
      
      System.out.print("What is your tax rate? ");
      taxRate = keyboard.nextDouble();
      
      grossPay = hours * payRate;
      netPay = grossPay * taxRate;
      
      System.out.println("Hello " + name);
      System.out.println("Your net pay is $" + netPay);
      keyboard.close();
   }
}
