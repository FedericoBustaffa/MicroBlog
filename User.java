import java.util.List;
import java.util.Set;

public interface User
{
    // metodi get
    public String GetUsername();

    public Set<String> GetFollowed();

    public Set<String> GetFollowers();

    public List<Integer> GetPostList();

    // altri metodi
    public void AddLike(Post p);

    public void AddPost(Post p);

    public void Follow(User u);
}
