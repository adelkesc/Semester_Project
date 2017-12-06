
public class Member
{
   private String name;
   private String password;

   public Member(String name, String password)
   {
      this.name = name;
      this.password = password;
   }

   public String getName()
   {
      return name;
   }

   public void setPassword(String password)
   {
      this.password = password;
   }

   public boolean checkPassword(String password)
   {
//      if (this.password.equals(password))
//         return true;
//      else
//         return false;
       return(this.password.equals(password));
      // Writing the above does the same thing, stop doing double the work!
   }

   // public boolean equals(Member other)
   // {
   // if(other instanceof Member && this.name.equals(other.getName()))
   // return true;
   // else
   // return false;
   // }

   public boolean equals(Object object)
   // the if statement is comparing to see if "object" an instance of the Member
   // class
   // if object is not an instance of Member
   {
      if (!(object instanceof Member))
      {
         return false;
      }
      Member other = (Member) object;
      return other.name.equals(name) && other.password.equals(password);
      // stores attributes, create new instances, assign object to new created
      // object
      // return is a compare statement for the entered name and password
      // vs. what is stored in memory.

   }

   // return(other instanceof Member && this.name == other.getName());
}
