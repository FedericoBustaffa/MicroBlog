import java.util.List;

public class MicroBlog
{
    private static void DisplayPost(Post p)
    {
        System.out.println("ID: " + p.GetID());
        System.out.println("\tAuthor: " + p.GetAuthor());
        System.out.println("\tText: " + p.GetText());
        System.out.println("\tDataTime: " + p.GetDataTime());
        
        List<User> likes = p.GetLikes();
        System.out.println("\tLikes: " + likes.size());
        for(User u : likes)
            System.out.println("\t\t" + u.GetUsername());
    }

    private static void DisplayUser(User u)
    {
        System.out.println("Username: " + u.GetUsername());
    }

    public static void main(String[] args)
    {
        Post p = new PostImpl("Federico", "Primo post");
        DisplayPost(p);

        User u = new UserImpl("Federico");
        DisplayUser(u);
    }
}