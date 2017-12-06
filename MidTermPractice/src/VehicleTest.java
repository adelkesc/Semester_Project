
public class VehicleTest
{

   public static void main(String[] args)
   {
      Vehicle car1 = new Vehicle("12345", 3000);
      Vehicle car2 = new Vehicle("67890", 6000);
      Vehicle car3 = new Vehicle("25673", 4500);
      
      System.out.println(car1);
      System.out.println(car2);
      
      System.out.println(car1.equals(car1));
      System.out.println(car1.equals(car2));
      System.out.println(car3.equals(car3));

   }

}
