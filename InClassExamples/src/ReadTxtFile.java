import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTxtFile
{
   //the file
   String filename = "example811.txt";
   public static void main(String[] args)
   {
      ReadTxtFile rtf = new ReadTxtFile();
      rtf.readTxtFile(rtf.filename);
   }

   public void readTxtFile(String filename)
   {
      File file = new File(filename);
      
      try
      {
         Scanner inFile = new Scanner(file);  //Opens the file
         while(inFile.hasNext())
         {
            String line = inFile.nextLine();  //Read a line from file
            String[] content = line.split(";");  //Split the line at the semicolon
            String txt = content[0].trim();
            int x = Integer.parseInt(content[1].trim());
            double y = Double.parseDouble(content[2].trim());
            //Printing all elements of the text.
            System.out.println(txt + " - " + x + " - " + y);
         }
         inFile.close();
      }
      catch(FileNotFoundException fne)
      {
         fne.printStackTrace();
      }
      System.out.println("THE END - reading data from file: " + file.getAbsolutePath());
   }
}
