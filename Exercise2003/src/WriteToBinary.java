import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteToBinary
{
   static Scanner keyboard = new Scanner(System.in);
   static String filename;

   public static void main(String[] args) throws IOException
   {
      System.out.print("Type filename: ");
      filename = keyboard.nextLine();

      WriteToBinary wtb = new WriteToBinary();
      wtb.writeToBin(filename);
   }

   public void writeToBin(String filename) throws IOException
   {
      FileOutputStream fstream = new FileOutputStream(filename);
      DataOutputStream outputFile = new DataOutputStream(fstream);
      
      System.out.println("Writing to file...");
      try
      {
         for (int index = 0; index <= 10; index++)
         {
            int multiTable = index * 7;  //no bug, i didn't write the print line to print the elements of the array
            System.out.print(index);
            outputFile.writeInt(multiTable);
         }
         outputFile.close();
         System.out.println("Done!");
      }  
      
      catch (FileNotFoundException e)
      {
         System.out.println("File not found.");
      }
      
      catch (IOException ioe)
      {
         System.out.println("Error.");
      }
   }

}
