import java.util.List;

public class MicroBlog
{
    // caratteristiche post
    private static void DisplayPost(Post p)
    {
        System.out.println("ID: " + p.GetID());
        System.out.println("\tAuthor: " + p.GetAuthor());
        System.out.println("\tText: " + p.GetText());
        System.out.println("\tDataTime: " + p.GetDataTime());
        
        List<String> likes = p.GetLikes();
        System.out.println("\tLikes: " + likes.size());
        for(String u : likes)
            System.out.println("\t\t" + u);
    }

    // caratteristiche utente
    private static void DisplayUser(User u)
    {
        System.out.println("Username: " + u.GetUsername());
    }

    public static void main(String[] args)
    {
        SocialNetwork facebook = new SocialNetworkImpl();
        User u1 = new UserImpl("Federico");
        User u2 = new UserImpl("Giovanni");
        facebook.AddUser(u1);
        facebook.AddUser(u2);
        
        Post p1 = new PostImpl("Federico", "Primo post");
        facebook.AddPost(u1, p1);
        facebook.AddLike(u2, p1);
        
    }
}