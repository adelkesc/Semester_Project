import java.util.Scanner;

public class IfStatement
{
   public static void main(String[] args)
   {
     
      int integerOne;
      int integerTwo;
      int modulus;
      double sum;
      double quotient;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter the first integer: ");
      integerOne = keyboard.nextInt();
      
      System.out.print("Please enter the second integer: ");
      integerTwo = keyboard.nextInt();
      
      if(integerOne < integerTwo)
      {
         System.out.print(integerOne + ", ");
         System.out.println(integerTwo);
      }
      else
      {
         System.out.println(integerTwo);
         System.out.println(integerOne);
      }
      
      sum = integerOne + integerTwo;
      quotient = integerTwo / integerOne;
      modulus = integerTwo % integerOne;
      
      System.out.println("The sum is: " + sum);
      
      if(integerTwo != 0)
      {
         System.out.println("The quotient is: " + quotient);
      }
      else
      {
         System.out.println("Cannot divide by 0!");
      }
      
      if(integerTwo != 0)
      {
         System.out.println("The modulus is: " + modulus);
      }
      else
      {
         System.out.println("Cannot divide by 0!");
      }
    
   }

}
