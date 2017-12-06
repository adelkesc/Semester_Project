import java.util.ArrayList;

public class Lecturer
{
   /**
    * This is the model and constructor for the Lecturer class.
    * 
    * @author 256523
    * @version 0.1
    */
   
   private String name;
   private String email;
   private String subject;
   private int salary;
   private ArrayList<Lecturer> lecturer = new ArrayList<Lecturer>();
   
   /**
    * The constructor contains 4 arguments.
    * 
    * @param name
    *    The lecturer name
    * @param email
    *    The lecturer email
    * @param subject
    *    The subject the lecturer teaches
    * @param salary
    *    The salary of the lecturer
    */

   public Lecturer(String name, String email, String subject, int salary)
   {
      this.name = name;
      this.email = email;
      this.subject = subject;
      this.salary = salary;
   }
   
   /**
    * The method to add lecturers to an ArrayList
    * 
    * @param setLecturer
    *    Adds lecturer to ArrayList  
    */
   
   public void setLecturer()
   {
      lecturer.add(this);
   }

}
