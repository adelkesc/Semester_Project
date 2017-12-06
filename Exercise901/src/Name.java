
public class Name
{
   private String firstName;
   private String lastName;
   
   //2 argument constructor
   public Name(String firstName, String lastName)
   {
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   public String getLastName()
   {
      return lastName;
   }
   
   public String getFullName()
   {
      return firstName + lastName;
   }
   public String getFormalName()
   {
      return lastName + "," + firstName;
   }
   
   public String toString()
   {
      String str = firstName + lastName;
      return str;
   }
}
