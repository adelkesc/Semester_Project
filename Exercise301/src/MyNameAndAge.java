import java.util.Scanner;  //Needed for the Scanner class

public class MyNameAndAge
{
   
   public static void main(String[] args)
   {
      String name;   //User's name
      int age;       //User's age
      
    //This Scanner object is created and necessary to designate and read
    //keyboard input.
    //The error won't affect the program function, it's only complaining
    //that the keyboard input is never closed.
      Scanner keyboard = new Scanner(System.in);    
      
      System.out.print("What is your name? ");
      name = keyboard.nextLine();
      
      System.out.print("What is your age? ");
      age = keyboard.nextInt();
      
      System.out.println("My name is " + name + ".");
      System.out.println("I am " + age + " years old.");
   }
}
