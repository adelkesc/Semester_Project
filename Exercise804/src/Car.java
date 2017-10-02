
public class Car
{
   //Fields
   private String color;
   private String owner;
   private String registration;
   
   //Constructor
   public Car(String color, String owner, String regNum)
   {
      this.color = color;
      this.owner = owner;
      this.registration = regNum;
   }
   
//   public String toString()
//   {
//      return "Car color: " + color;
//   }
   
   //Setters or Mutators
   public void setColor(String color)
   {
      this.color = color;
   }
   public void setOwner(String owner)
   {
      this.owner = owner;
   }
   public void setRegistration(String regNum)
   {
      this.registration = regNum;
   }
   
   //Getters or Accessors
   public String getColor()
   {
      return color;
   }
   public String getOwner()
   {
      return owner;
   }
   public String getRegNum()
   {
      return registration;
   }
}
