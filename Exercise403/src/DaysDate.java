import java.util.Scanner;

public class DaysDate
{
   public static void main(String[] args)
   {
      int day;
      int month;
      int year;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Input the day: " ); 
      day = keyboard.nextInt();
      
      System.out.print("Input the month: ");
      month = keyboard.nextInt();
      
      System.out.print("Input the year: ");
      year = keyboard.nextInt();
      
      
      if(day < 0)
      {
         System.out.print("Invalid");
      }
      else if(day > 31)
      {
         System.out.print("Invalid");
      }
      else if(year < 2017)
      {
         System.out.print("Invalid");
      }
     
      
        switch (month)
        {
           case 1:
              System.out.print(day + "/1/" + year);
              break;
           
           case 2:
              System.out.print(day + "/2/" + year);
              break;
              
           case 3:
              System.out.print(day + "/3/" + year);
              break;
           
           case 4:
              System.out.print(day + "/4/" + year);
              break;   
              
           case 5:
              System.out.print(day + "/5/" + year);
              break;
           
           case 6:
              System.out.print(day + "/6/" + year);
              break;
              
           case 7:
              System.out.print(day + "/7/" + year);
              break;
           
           case 8:
              System.out.print(day + "/8/" + year);
              break;   
              
           case 9:
              System.out.print(day + "/9/" + year);
              break;
           
           case 10:
              System.out.print(day + "/10/" + year);
              break;
              
           case 11:
              System.out.print(day + "/11/" + year);
              break;
           
           case 12:
              System.out.print(day + "/12/" + year);
              break;   
           
              
           default:
              System.out.println("Error");
        }
      
      keyboard.close();
   }
}
