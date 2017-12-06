
public class Post
{
   private String content;
   private Member member;
   private MyDate date;
    
   public Post(String content, Member member, MyDate date)
   {
      this.content = content;
      this.member = member;
      this.date = date.copy();
      //My date is a composed class to the Post class so it must be .copy
   }
   
   public String getContent()
   {
      return content;
   }
   public MyDate getDate()
   {
      return date;
   }
   public Member getMember()
   {
      return member;
   }
   
   public void edit(String newContent)
   {
      this.content = newContent;
   }
   
   public String toString()
   {
      String str = ("Post: " + content + " Member: " + member.getName() + " Date: " + date);
      return str;
      //need to have .getName on member otherwise the program will print the object
      //a toString method can also be added to the member class to remedy this so
      //"member" should work on it's own.
   }
}
