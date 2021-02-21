
public class MicroBlog
{
    public static void main(String[] args)
    {
        SocialNetwork sn = new SocialNetworkImpl();

        sn.AddUser("Federico");
        sn.AddUser("Giovanni");
        sn.AddUser("Lorenzo");
        sn.AddUser("Francesco");

        sn.AddPost("Federico", "primo post dell'anno");
        sn.AddPost("Federico", "buongiorno");
    }
}