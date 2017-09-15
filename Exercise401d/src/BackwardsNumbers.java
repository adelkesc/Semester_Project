//Make a program that prints "Hello" with the numbers backwards starting from 4.

public class BackwardsNumbers
{
   public static void main(String[] args)
   {
      //Declare variable
      int number = 4;
            
      //Use while loop to test boolean expression
            while (number >= 1)
            {
               //Have the program print and decrement the number each time
               System.out.println(number + " Hello");
               number--;
            }
   }
}
