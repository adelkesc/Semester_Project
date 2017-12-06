
public class MyDateTest
{

   public static void main(String[] args)
   {
     MyDate date = new MyDate(23,1,1996);
     
     date.set(25, 2, 1998);
     
     System.out.println(date.getDay());
     System.out.println(date.getMonth());
     System.out.println(date.getYear());
    
     System.out.println(date.toString());
     
     Student meg = new Student("Meg", 3, 10, 1997);
     meg.printDob();
     
   }
   

}
