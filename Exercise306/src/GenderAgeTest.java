import java.util.Scanner;

public class GenderAgeTest
{
   public static void main(String[] args)
   {
      //Declaring variables
      int age;
      String input;
      char gender;
      
      //Designating scanner input method
      Scanner keyboard = new Scanner(System.in);
      
      //Collecting input data from the user
      System.out.print("Please enter your age: ");
      age = keyboard.nextInt();
      
      //Clearing keyboard buffer
      keyboard.nextLine();
      
      System.out.print("Please enter your gender (M or F): ");
      input = keyboard.nextLine();
      gender = input.charAt(0);
      
         if(age < 0)
         {
            System.out.print("Invalid entry.");
         }
         else if(gender != 'M' && gender != 'F')
         {
            System.out.println("Invalid entry.");
         }
      
            if(age < 18 && gender == 'M')
            {
               System.out.print("Boy");
            }
            else if(age < 18 && gender != 'M')
            {
               System.out.println("Girl");
            }
            
               if(age >= 18 && gender == 'M')
               {
                  System.out.print("Man");
               }
               else if(age >= 18 && gender != 'M')
               {
                  System.out.println("Woman");
               }
               
   keyboard.close();   
   }
}
