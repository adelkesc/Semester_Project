
public class Van extends Car
{
   private int maxLoad;
   
   public Van(String theOwner, double price, String regNo, int maxLoad)
   {
      super(theOwner, price, regNo);
      this.maxLoad = maxLoad;
   }
   
   public int getMaxLoad()
   {
      return maxLoad;
   }
   //Set when the object is made.
   
   public boolean equals(Object obj)
   {
      if(!(obj instanceof Van))
      {
         return false;
      }
      
      Van other = (Van) obj;
      return super.equals(obj)&& maxLoad == (other.maxLoad);
   }
}
