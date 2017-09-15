import java.util.Scanner;

public class VowelTest
{
   public static void main(String[] args)
   {
      
      String input;
      char vowel;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Please enter a vowel: ");
      input = keyboard.nextLine();
      vowel = input.charAt(0);
      
      switch (vowel)
      {
         case 'a':
            System.out.println("Apricot");
            break;
            
         case 'e':
            System.out.println("Elder");
            break;
            
         case 'i':
            System.out.println("Iron");
            break;
            
         case 'o':
            System.out.println("Otter");
            break;
            
         case 'u':
            System.out.println("Utility");
            break;
            
         case 'y':
            System.out.println("'Y' is sometimes a vowel.");
            break;
            
         default:
            System.out.println("That letter is not a vowel.");
         
      }
      keyboard.close();
   }

}
