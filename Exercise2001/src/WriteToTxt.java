import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteToTxt
{
   static Scanner keyboard = new Scanner(System.in);
   static String filename;

   public static void main(String[] args)
   {
      System.out.print("Type filename: ");
      filename = keyboard.nextLine();

      WriteToTxt wtt = new WriteToTxt();
      wtt.writeTxtFile(filename);
   }

   public void writeTxtFile(String filename)
   {
      File txtFile = new File(filename);

      try
      {
         PrintWriter outfile = new PrintWriter(txtFile);
         boolean quit = false;
         while (quit == false)
         {
            System.out.print("Type name of friend: ");
            String name = keyboard.nextLine(); // name is being declared and
                                               // initialized

            if (name.equals("QUIT"))
            {
               quit = true;
            }
            else
            {
               outfile.println(name);
               outfile.flush();
            }
         }
         outfile.close();
      }

      catch (FileNotFoundException fne)
      {
         System.out.println("File Not Found");
      }
   }

}
