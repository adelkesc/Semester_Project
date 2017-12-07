import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromBinary
{
   static Scanner keyboard = new Scanner(System.in);
   static String filename;

   public static void main(String[] args) throws IOException
   {
      System.out.print("Enter filename: ");
      filename = keyboard.nextLine();
      
      ReadFromBinary rfb = new ReadFromBinary();
      rfb.readFromBin(filename);
   }

   public void readFromBin(String filename) throws IOException
   {
      boolean endOfFile = false;

      FileInputStream fstream = new FileInputStream(filename);
      DataInputStream inputFile = new DataInputStream(fstream);

      System.out.println("Reading from file...");

      while (!endOfFile)
      {
         try
         {
            int seven = inputFile.readInt();
            System.out.print(seven + " ");
         }

         catch (EOFException eof)
         {
            endOfFile = true;
         }

         catch (FileNotFoundException fnf)
         {
            System.out.println("File not found.");
         }

         catch (IOException e)
         {
            System.out.println("Error!");
         }
         
      }
         System.out.println("\nDone.");
         inputFile.close();
        
   }

}
