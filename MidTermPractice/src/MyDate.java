
public class MyDate
{
   //Instance variables/fields
   private int day;
   private int month;
   private int year;
   
   //3 argument constructor
   public MyDate(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
   //Getters
   public int getDay()
   {
      return day;
   }
   public int getMonth()
   {
      return month;
   }
   public int getYear()
   {
      return year;
   }
   
   public void set(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
   public String toString()
   {
      String str = day + "/" + month + "/" + year;
      return str;
   }
   
   public MyDate copy() 
   {
      return new MyDate(this.day, this.month, this.year);
   }
   
}
