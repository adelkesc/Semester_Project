// Calculate the total cost of items and their tax.  In DKK, of course.

public class Tax
{
   public static void main(String[] args)
   {
      double tax = 0.25; //Sales tax in Denmark
      double priceItemOne = 80; //Price of item one
      double priceItemTwo = 140; //Price of item two
      double priceItemThree = 230; //Price of item three
      double totalPrice; //Total price of all items
      double salesTax; //Total amount of the tax
      double totalAll; //Total price of all items with sales tax
      
      totalPrice = priceItemOne + priceItemTwo + priceItemThree;
      salesTax = totalPrice * tax;
      totalAll = totalPrice + salesTax;
      System.out.println("The total price of all items, including sales tax, is " 
                         + totalAll + " kr.");
     
   }
}
