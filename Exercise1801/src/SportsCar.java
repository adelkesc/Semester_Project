
public class SportsCar extends Car
{
   private int maxVelocity;
   
   public SportsCar(String theOwner, double price, String regNo, int maxVelocity)
   {
      super(theOwner, price, regNo);
      this.maxVelocity = maxVelocity;
   }
   
   public int getMaxVelocity()
   {
      return maxVelocity;
   }
   
   public boolean equals(Object obj)
   {
      if(!(obj instanceof SportsCar))
      {
         return false;
      }
      
      SportsCar other = (SportsCar) obj;
      return super.equals(obj)&& maxVelocity == (other.maxVelocity);
   }
   
   public String toString()
   {
      String str = super.toString() + "\nMaximum Velocity: " + maxVelocity;
      return str;
   }
}
