
public class PersonTest
{
   public static void main(String[] args)
   {
     Person p1 = new Person("Joe", "jan01");
     
     
     System.out.println(p1.getName());
     System.out.println(p1.getBirthday());
     
     Person p2 = new Person("09/20/2017");
     p2.setName("Maria");
     System.out.println(p2.getName());
     System.out.println(p2.getBirthday());
     
     
   }
}
