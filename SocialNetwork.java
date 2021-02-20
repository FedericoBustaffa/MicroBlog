import java.util.Set;
import java.util.List;
import java.util.Map;

public interface SocialNetwork
{
    // metodi get
    public Map<String, Set<String>> GetNet();

    public Map<String, User> GetUserList();

    public List<Post> GetPostList();

    // altri metodi
    public void AddUser(String username);

    public void AddPost(String username, String text);

    public void AddLike(User u, Post p);
}
