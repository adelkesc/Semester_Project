
public class Vehicle
{
   private String owner;
   private double price;
   
   public Vehicle(String owner, double price)
   {
      this.owner = owner;
      this.price = price;
   }
   
   public void setOwner(String theOwner)
   {
      this.owner = theOwner;
   }
   public void setPrice(double price)
   {
      this.price = price;
   }
   
   public String getOwner()
   {
      return owner;
   }
   public double getPrice()
   {
      return price;
   }
   
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Vehicle))
      {
         return false;
      }
      
      Vehicle other = (Vehicle) obj;
      return owner.equals(other.owner)&& price == (other.price);
   }
  
   public String toString()
   {
      String str = "Owner: " + owner + "\nPrice: " + price;
      return str;
   }
}
