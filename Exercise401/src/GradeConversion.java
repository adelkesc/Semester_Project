import java.util.Scanner;

public class GradeConversion
{
   public static void main(String[] args)
   {
      
      int input;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter a grade: ");
      input = keyboard.nextInt();
      
      switch (input)
      {
         case 12:
            System.out.println("The international grade is 'A'.");
            break;
            
         case 10:
            System.out.println("The international grade is 'B'.");
            break;
            
         case 7:
            System.out.println("The international grade is 'C'.");
            break;
            
         case 4:
            System.out.println("The international grade is 'D'.");
            break;
            
         case 2:
            System.out.println("The international grade is 'E'.");
            break;
            
         case 0:
            System.out.println("The international grade is 'Fx'.");
            break;
            
         case -3:
            System.out.println("The international grade is 'F'.");
            break;
               
         default:
            System.out.println("This is an invalid grade!'");
            
           
      }
      keyboard.close();
   }
  
}
