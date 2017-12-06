
public class StudentTest
{

   public static void main(String[] args)
   {
      Student one = new Student ("nan", 'f', 12345);
      Student two = new Student ("joe", 'm', 67890);
      Student three = new Student ("pam", 'f', 54321);

      System.out.println(one.toString());
      System.out.println(two.toString());
      System.out.println(three.toString());
   }

}
