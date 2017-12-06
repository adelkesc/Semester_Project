
public class ProductTest
{
   public static void main(String[] args)
   {
      Product p1 = new Product("Ilia", 10.25);
      
      System.out.println(p1);
      
      p1.setPrice(7.25);
      System.out.println(p1);
   }
}
