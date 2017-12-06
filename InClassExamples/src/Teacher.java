
public class Teacher
{
   String title = "Associate Professor";
   String dept = "ICT";
   
   public Teacher()
   {
      System.out.println("I am a superclass constructor.");
   }
   public Teacher(String title)
   {
      this.title = title;
   }
   
   void teach()
   {
      System.out.println("teaching");
   }
   //This is the superclass because inheritance
}
