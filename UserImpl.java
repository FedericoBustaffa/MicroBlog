import java.util.List;
import java.util.Vector;
import java.util.Set;
import java.util.HashSet;

public class UserImpl implements User
{
    // metadati
    private String username;
    private Set<String> followed;
    private Set<String> followers;
    private List<Integer> post_list;

    // costruttore
    public UserImpl(String username)
    {
        this.username = username;
        this.followed = new HashSet<String>();
        this.followers = new HashSet<String>();
        this.post_list = new Vector<Integer>();
    }

    // metodi get
    public String GetUsername() { return username; }

    public Set<String> GetFollowed() { return followed; }

    public Set<String> GetFollowers() { return followers; }

    public List<Integer> GetPostList() { return post_list; }

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
