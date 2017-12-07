
public class Car extends Vehicle
{
   private String regNo;
   
   public Car(String theOwner, double price, String regNo)
   {
      super(theOwner, price);
      this.regNo = regNo;
   }
   
   public void setRegistrationNumber(String registrationNumber)
   {
      this.regNo = registrationNumber;
   }
   public String getRegistrationNumber()
   {
      return regNo;
   }

   public boolean equals(Object obj)
   {
      if(!(obj instanceof Car))
      {
         return false;
      }
      
      Car other = (Car) obj;
      return super.equals(obj)&& regNo.equals(other.regNo);
   }
   
   public String toString()
   {
      String str = super.toString() + "\nRegistration Number: " + regNo;
      return str;
   }
}
