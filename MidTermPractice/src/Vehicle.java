
public class Vehicle
{
   private String licensePlate;
   private double weight;
   
   public Vehicle(String licensePlate, double weight)
   {
      this.licensePlate = licensePlate;
      this.weight = weight;
   }
   
   public String getLicensePlate()
   {
      return licensePlate;
   }
   public double getWeight()
   {
      return weight;
   }
   
   public String toString()
   {
      String str = "License Plate: " + licensePlate + 
                   "\nVehicle Weight: " + weight;
      return str;
   }
   
   public boolean equals(Vehicle other)
   {
      return(other instanceof Vehicle && this.licensePlate == other.getLicensePlate()
            && this.weight == other.getWeight());
      
      
//      if(!(other instanceof Vehicle))
//      {
//         return false;
//      }
//      Vehicle object = (Vehicle) other;
//      return other.licensePlate.equals(licensePlate)&& other.weight == (weight);
   }
}
