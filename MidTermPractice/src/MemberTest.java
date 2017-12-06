
public class MemberTest
{
   public static void main(String[] args)
   {
      Member p1 = new Member("admin", "password");
      Member p2 = new Member("jon", "password");
      
      System.out.println(p1.equals(p2));
      
      p1.setPassword("12345");
      
      System.out.println(p1.getName());
      
      System.out.println(p1.checkPassword("12345"));
      System.out.println(p1.checkPassword("12346"));
      
      
   }
}
