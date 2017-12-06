
public class JavaTeacher extends Teacher
{
   String majorCourse = "Java";
   
   public JavaTeacher()
   {
      super("instructor");
      System.out.println("I am a subclass constructor.");
   }
   
   void teach()
   {
      System.out.println("dancing");
   }
   
   public static void main(String[] args)
   {
      JavaTeacher jtObject = new JavaTeacher();
      System.out.println(jtObject.title);
      System.out.println(jtObject.dept);
      System.out.println(jtObject.majorCourse);
      jtObject.teach();
   }
}
