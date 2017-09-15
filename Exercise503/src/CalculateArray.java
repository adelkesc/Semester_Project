//Collect 5 integers into an array, then find their sum, average, lowest and 
//highest number and print it.

import java.util.Scanner;

public class CalculateArray
{
   public static void main(String[] args)
   {   
      //Array declaration
      int[] total = new int[5];
      
      Scanner keyboard = new Scanner(System.in);
      
      //Collect user input
      System.out.println("Please enter 5 integers:");
      
      for(int arrayList = 0; arrayList < 5; arrayList++)
      {
         total[arrayList] = keyboard.nextInt(); 
      }
      
         int smallest = total[0];
         for(int arrayList = 1; arrayList < total.length; arrayList++)
         {
            if(total[arrayList] < smallest)
               smallest = total[arrayList];
         }
         System.out.println("Smallest number: " + smallest);
         
         int largest = total[0];
         for(int arrayList = 1; arrayList < total.length; arrayList++)
         {
            if(total[arrayList] > largest)
               largest = total[arrayList];
         }
         System.out.println("Largest number: " + largest);
         
            int sum = 0;
            for(int arrayList = 0; arrayList < total.length; arrayList++)
               sum += total[arrayList];
            System.out.println("Sum: " + sum);
            
            int average = 0;
            int averageFinal;
            for(int arrayList = 0; arrayList < total.length; arrayList++)
               average += total[arrayList];
            averageFinal = average / total.length;
            System.out.println("Average: " + averageFinal);
            
      keyboard.close();    
   }
}
