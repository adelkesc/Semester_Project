import java.util.Scanner;  //Needed for keyboard input.

public class MyPersonalData
{
   public static void main(String[] args)
   {
      String name;      //To hold a name
      int age;          //To hold age
      String address;   //To hold address
      
      Scanner keyboard = new Scanner(System.in);   //Indicates input from keyboard.
      
      System.out.print("Name: ");
      name = keyboard.nextLine();
      
      System.out.print("Age: ");
      age = keyboard.nextInt();
      
      //Clears data left in the keyboard buffer.
      keyboard.nextLine();
      
      System.out.print("Address: ");
      address = keyboard.nextLine();
      
      System.out.println("Your name is " + name);
      System.out.println("Your age is " + age);
      System.out.println("Your address is " + address);
   }
}
