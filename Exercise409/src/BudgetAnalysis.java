import java.util.Scanner;

public class BudgetAnalysis
{
   public static void main(String[] args)
   {
      //Variables
      int days;
      double budgetStart;
      double expenses;
      double moneySpent;
      
      Scanner keyboard = new Scanner(System.in);
      
      //Get the monthly budget
      System.out.println("Monthly budget: ");
      budgetStart = keyboard.nextDouble();
      
      //Get the number of days
      System.out.println("How many days are in this month: ");
      days = keyboard.nextInt();
      
      //Set the accumulator
      moneySpent = 0;
      
      for(int count = 0; count < days; count++)
      {
         System.out.println("Total expense for day " + count + ": ");
         expenses = keyboard.nextDouble();
         moneySpent += expenses;
      }
      System.out.println("You have spent: " + moneySpent);
      
      //Variable
      double moneyRemain;
      
      moneyRemain = budgetStart - moneySpent;
     
     if(budgetStart > moneySpent)
     {
        System.out.println("You are " + moneyRemain + " under budget.");
     }
     else if(moneySpent > budgetStart)
     {
        System.out.println("You are " + moneyRemain + " over budget.");
     }
     else
     {
        System.out.println("Same");
     }
      
     keyboard.close(); 
   }
}
