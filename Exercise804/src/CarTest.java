
public class CarTest
{
   public static void main(String[] args)
   {
      Car c = new Car("red", "max", "12345");
      
      c.setColor("blue");
      System.out.println(c.getColor());
      System.out.println(c.getOwner());
      System.out.println(c.getRegNum());
   }
}
