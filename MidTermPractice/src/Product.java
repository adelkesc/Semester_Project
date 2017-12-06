
public class Product
{
   private String name;
   private double price;
   
   public Product(String name, double price)
   {
      this.name = name;
      this.price = price;
   }
   
   public String getName()
   {
      return name;
   }
   public double getPrice()
   {
      return price;
   }
   
   public void setPrice(double price)
   {
      this.price = price;
   }
   //Explain setter
   
   public Product copy()
   {
      return new Product(this.name, this.price);
   }
   //Explain this and why it's necessary
   
   public String toString()
   {
      String str = ("Name: " + name + "\nPrice: " + price); 
      return str;
   }
}
