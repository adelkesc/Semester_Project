
public class TestArgs
{
   public static void main(String[] args)
   {
      System.out.println("Print and call the next method");
      nextMethod(args);
   }
   
   public static void nextMethod(String[] args)
   {
      for (String s : args)
      {
         System.out.println(s);
      }
   }
}
