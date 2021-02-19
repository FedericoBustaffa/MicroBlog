import java.util.List;

public interface User
{
    public String GetUsername();

    public List<String> GetFollowed();

    public void AddLike(Post p);

    public void AddPost(Post p);

    public void Follow(User u);
}
