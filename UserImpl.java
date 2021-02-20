import java.util.List;
import java.util.Vector;

public class UserImpl implements User
{
    // metadati
    private String username;
    private Set<User> followed;
    private Set<User> followers;
    private List<Post> post_list;

    // costruttore
    public UserImpl(String username)
    {
        this.username = username;
        this.followed = new HashSet<User>();
        this.followers = new HashSet<User>();
        this.post_list = new Vector<Post>();
    }

    // metodi get
    public String GetUsername() { return username; }

    public Set<User> GetFollowed() { return followed; }

    public Set<User> GetFollowers() { return followers; }

    public List<Post> GetPostList() { return post_list; }

    // altri metodi
    public void AddLike(Post p)
    {
    }

    public void AddPost(Post p)
    {
    }

    public void Follow(User u)
    {
    }
}
