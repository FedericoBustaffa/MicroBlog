import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.List;

public class SocialNetworkImpl implements SocialNetwork
{
    // metadati
    private Map<String, Set<String>> net;
    private List<User> user_list;
    private List<Post> post_list;
    
    // costruttore
    public SocialNetworkImpl()
    {
        this.net = new HashMap<String, Set<String>>();
        this.user_list = new Vector<User>();
        this.post_list = new Vector<Post>();
    }

    // metodi
    public void AddUser(User u)
    {
        net.put(u.GetUsername(), u.GetFollowed());
    }

    public void AddPost(User u, Post p)
    {
        post_list.add(p);
        u.AddPost(p);
    }

    public void AddLike(User u, Post p)
    {
        u.AddLike(p);
        u.Follow(p.GetAuthor());
    }

    public List<User> GetUserList() { return user_list; }

    public List<Post> GetPostList() { return post_list; }
}
