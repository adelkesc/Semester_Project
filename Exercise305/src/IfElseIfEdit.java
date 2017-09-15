import java.util.Scanner;

public class IfElseIfEdit
{
   public static void main(String[] args)
   {
      int age;   
      
      //Declared Scanner input
      Scanner keyboard = new Scanner(System.in);   
      
      System.out.print("Please enter your age: ");
      age = keyboard.nextInt();
      
      if(age < 0)
      {
        System.out.println("Error in age value."); 
      }
      else if(age <= 12)
      {
         System.out.println("You are a child.");
      }
      else if(age <= 19)
      {
         System.out.println("You are a teenager.");
      }
      else if(age <= 65)
      {
         System.out.println("You are an adult.");
      }
      else if(age <= 120)
      {
         System.out.println("You are a senior citizen.");
      }
      if(age > 120)
      {
         System.out.println("You are a record breaker!");
      }
      keyboard.close();
   }
}
