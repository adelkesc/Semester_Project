
public class PostTest
{

   public static void main(String[] args)
   {
      Member member1 = new Member("Mary", "pass");
      MyDate date1 = new MyDate(12,10,2017);
      Post p1 = new Post("content", member1, date1);
      
      System.out.println(p1);
//     System.out.println(p1.getMember());
  //    System.out.println(p1.getDate());
      p1.edit("new content");
      
      System.out.println(p1);
      System.out.println(date1.getDay());
   }

}
