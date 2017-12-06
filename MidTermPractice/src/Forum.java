import java.util.ArrayList;

public class Forum
{
   private String name;
   private Post post;
   private ArrayList<Post> postList;
   
   public Forum(String name)
   {
      this.name = name;
      this.post = null;
//      this.post = post;
      this.postList = new ArrayList<>();
   }
   
   public String getName()
   {
      return name;
   }
   
   public void addPost(Post post)
   {
      this.post = post;
   }
   public void removePost(Post post)
   {
      this.post = null;
   }
   
   public int getPostCount()
   {
      return postList.size();
   }
   
   public ArrayList<Post> getPostsBy(String memberName)
   {
      ArrayList<Post> memberPosts = new ArrayList<>();
      for(int index = 0; index < postList.size(); index++)
      {
         Post post = postList.get(index);
         if(post.getMember().getName().equals(memberName))
         {
            memberPosts.add(post);
         }
      }
      return memberPosts;
   }
}
