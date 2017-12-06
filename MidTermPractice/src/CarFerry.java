//I could mess with an array list since the UML suggests more than one car.
//It would be good for practice at least.
public class CarFerry
{
   private String name;
   private double weight;
   private double maxWeight;
   private Vehicle vehicle;
   
   public CarFerry(String name, double weight, double maxWeight)
   {
      this.name = name;
      this.weight = weight;
      this.maxWeight = maxWeight;
      this.vehicle = null;
   }
   
   public void addVehicle(Vehicle vehicle)
   {
      this.vehicle = vehicle;
   }
   public void removeVehicle(Vehicle vehicle)
   {
      this.vehicle = null;
   }
   
   public Vehicle getVehicle(String licensePlate)
   {
      return vehicle;
   }
   public double getTotalWeight()
   {
      return vehicle.getWeight() + weight;
   }
   
   public boolean isOverWeight()
   {
      return(getTotalWeight() > maxWeight);
   }
   
   public String getName()
   {
      return name;
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public double getWeight()
   {
      return weight;
   }
   public double getMaxWeight()
   {
      return maxWeight;
   }
}
