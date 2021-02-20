
public class MicroBlog
{
    public static void main(String[] args)
    {
        SocialNetwork sn = new SocialNetworkImpl();
        sn.AddUser("Federico");
        sn.AddUser("Giovanni");
        sn.AddPost("Federico", "Ciao sono Federico");
        sn.AddLike("")
    }
}