import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Vector;
import java.util.List;

public class SocialNetworkImpl implements SocialNetwork
{
    // metadati
    private Map<String, Set<String>> net;
    private Map<String, User> user_list;
    private List<Post> post_list;
    
    // costruttore
    public SocialNetworkImpl()
    {
        this.net = new HashMap<String, Set<String>>();
        this.user_list = new HashMap<String, User>();
        this.post_list = new Vector<Post>();
    }

    // metodi get
    public Map<String, Set<String>> GetNet() { return net; }
    
    public Map<String, User> GetUserList() { return user_list; }

    public User GetUser(String username) { return user_list.get(username); }

    public List<Post> GetPostList() { return post_list; }
    
    // altri metodi
    public void AddUser(String username)
    {
        user_list.put(username, new UserImpl(username));
        net.put(username, new HashSet<String>());
    }

    public void AddPost(String username, String text)
    {
        Post new_post = new PostImpl(username, text);
        post_list.add(new_post);
        

    }

    public void AddLike(User u, Post p)
    {
        u.AddLike(p);
        u.Follow(p.GetAuthor());
    }
}
