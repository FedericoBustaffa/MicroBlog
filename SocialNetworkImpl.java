import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

public class SocialNetworkImpl implements SocialNetwork
{
    // metadati
    private Map<String, Set<String>> net;
    private Map<String, User> user_list;
    private Map<Integer, Post> post_list;
    
    // costruttore
    public SocialNetworkImpl()
    {
        this.net = new HashMap<String, Set<String>>();
        this.user_list = new HashMap<String, User>();
        this.post_list = new HashMap<Integer, Post>();
    }

    // metodi get
    public Map<String, Set<String>> GetNet() { return net; }
    
    public Map<String, User> GetUserList() { return user_list; }

    public Map<Integer, Post> GetPostList() { return post_list; }
    
    // altri metodi
    public void AddUser(String username)
    {
        net.put(username, new HashSet<String>());
        user_list.put(username, new UserImpl(username));
    }

    public void AddPost(String username, String text)
    {
    }

    public void AddLike(User u, Post p)
    {
    }
}
