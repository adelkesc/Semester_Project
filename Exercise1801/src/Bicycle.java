
public class Bicycle extends Vehicle
{
   private int gears;
   
   public Bicycle(String theOwner, double price, int numberOfGears)
   {
      super(theOwner, price);
      this.gears = numberOfGears;
   }
   
   public void setGears(int numberOfGears)
   {
      this.gears = numberOfGears;
   }
   public int getGears()
   {
      return gears;
   }
   
   //Overridden methods, I don't need to do this here because owner and
   //price function the same way across multiple classes.  Only when there 
   //are methods with the same name that function differently across classes.
//   @Override
//   public void setOwner(String theOwner)
//   {
//      super.setOwner(theOwner);
//   }
//   @Override
//   public void setPrice(double price)
//   {
//      super.setPrice(price);
//   }
   
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Bicycle))
      {
         return false;
      }
      
      Bicycle other = (Bicycle) obj;
      return super.equals(obj)&& gears == (other.gears);
   }
   
   public String toString()
   {
      String str = super.toString() + "\nGears: " + gears; 
      return str;
   }
}
