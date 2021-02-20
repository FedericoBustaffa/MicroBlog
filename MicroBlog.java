import java.util.List;

public class MicroBlog
{
    public static void main(String[] args)
    {
        SocialNetwork sn = new SocialNetworkImpl();
        sn.AddUser("Federico");
        sn.AddUser("Giovanni");
        sn.AddPost("Federico", "Ciao sono Federico");
        sn.AddPost("Federico", "Oggi boh");

        User utente_attivo = sn.GetUser("Giovanni");
        User utente1 = sn.GetUser("Federico");
        List<Post> post_utente1 = utente1.GetPostList();

        for(Post p : post_utente1)
            System.out.println(p.GetText());

    }
}