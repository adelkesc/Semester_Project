import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromTxt
{
   static Scanner keyboard = new Scanner(System.in);
   static String filename;
   public static void main(String[] args)
   {
      System.out.print("Type the name of a file: ");
      filename = keyboard.nextLine();
      
      ReadFromTxt rft = new ReadFromTxt();
      rft.readFromTxt(filename);
   }
   public void readFromTxt(String filename)
   {
      File file = new File(filename);
      
      try
      {
         Scanner inFile = new Scanner(file);
         while(inFile.hasNext())
         {
            String line = inFile.nextLine();
            System.out.println(line);
         }
         inFile.close();
      }
      
      catch(FileNotFoundException fne)
      {
         System.out.println("File Not Found!");
      }
   }

}
