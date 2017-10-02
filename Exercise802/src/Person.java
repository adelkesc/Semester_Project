
public class Person
{
   //Fields for the class
   private String name;
   private String birthday;
   
      //Constructor 1 with 2 arguments
      public Person(String name, String birthday)
      {
         this.name = name;
         this.birthday = birthday;
      }
      
      //Constructor 2 with 1 argument
      public Person(String birthday)
      {
         this.name = "No Name";
         this.birthday = birthday;
      }
      
      //Setters
      public void setName(String name)
      {
         this.name = name;
      }
      public void setBirthday(String birthday)
      {
         this.birthday = birthday;   
      }
      
      //Getters
      public String getName()
      {
         return this.name;
      }
      public String getBirthday()
      {
         return this.birthday;
      }

}
