import java.util.Scanner;  //Needed for Scanner class

public class SumProduct
{
   public static void main(String[] args)
   {
      
      //Variables are declared here
      int integerOne;
      int integerTwo;
      int integerThree;
      double sum;
      double product;
      
    //Designates which input the Scanner class will be using
      Scanner keyboard = new Scanner(System.in);   
      
      System.out.print("First integer: ");
      integerOne = keyboard.nextInt();
      
      System.out.print("Second integer: ");
      integerTwo = keyboard.nextInt();
      
      System.out.print("Third integer: ");
      integerThree = keyboard.nextInt();
      
      //Instructions on how the program should calculate the variables.
      sum = integerOne + integerTwo + integerThree;
      product = integerOne * integerTwo * integerThree;
      
      System.out.println("The sum is: " + sum);
      System.out.println("The product is: " + product);
      
      keyboard.close();
   }
}