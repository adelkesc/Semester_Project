
public class VehicleTest
{

   public static void main(String[] args)
   {
      Vehicle car1 = new Vehicle("Jon", 12345);
      Vehicle car2 = new Vehicle("Mary", 67890);
      
      System.out.println(car1.equals(car1));
      System.out.println(car1.equals(car2));

   }

}
