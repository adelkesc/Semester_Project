import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

//A simple class to write to a text file
public class WriteTextFile
{
   //the filename and maybe the path as well
   String filename = "example811.txt";
   public static void main(String[] args)
   {
      WriteTextFile wtf = new WriteTextFile();
      wtf.writeTxtfile(wtf.filename);
   }
   public void writeTxtfile(String filename)
   {
      File txtFile = new File(filename);
      //a try-catch is necessary
      try
      {
         PrintWriter outFile = new PrintWriter(txtFile);
         String[] txtStrings = { "Line 1; 1; 2.9",
                                 "Line 2; 4; 3.4",
                                 "Line 3; 4; 23.3",
                                 "Line 4; 9; 1.1",
                                 "Line 5; 3; 3.2"};
         for(int index = 0; index < txtStrings.length; index++)
         {
            outFile.println(txtStrings[index]);
            outFile.flush(); //force it to write the text(you can, it's to be sure)
         }
         outFile.close(); //close the file
      }
      catch(FileNotFoundException fne)
      {
         fne.printStackTrace();
      }
      System.out.println("THE END - writing txt to file: " + txtFile.getAbsolutePath());
   }
}
