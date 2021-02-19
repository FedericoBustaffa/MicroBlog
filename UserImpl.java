import java.util.List;
import java.util.Vector;

public class UserImpl implements User
{
    // metadati
    private String username;
    private List<String> followed;
    private List<Post> post_list;

    // costruttore
    public UserImpl(String username)
    {
        this.username = username;
        this.followed = new Vector<String>();
    }

    // metodi
    public String GetUsername() { return username; }

    public List<String> GetFollowed() { return followed; }

    public void AddLike(Post p)
    {
        
    }

    public void AddPost(Post p)
    {
        post_list.add(p);
    }

    public void Follow(User u)
    {
        followed.add(u.GetUsername());
    }
}
