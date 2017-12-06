//Example of calling other classes as fields

public class Student
{
   private String name;
   private MyDate dob;
   
   public Student(String name, int day, int month, int year) 
   {
      this.name = name;
      dob = new MyDate(day, month, year);
      
   }
   
   public void printDob()
   {
      System.out.println("The date of birth is: " + dob.toString());
   }
   public void printName()
   {
      System.out.println("Name: " + name);
   }
}
