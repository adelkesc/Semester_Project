
public class BicycleTest
{

   public static void main(String[] args)
   {
      Vehicle v1 = new Bicycle("anon", 150, 5);
      
      Bicycle b1 = (Bicycle)v1;
      b1.setGears(7);
      
      System.out.println(v1);

   }

}
