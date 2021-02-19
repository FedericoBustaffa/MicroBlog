
public interface SocialNetwork
{
    public void AddUser(User u);

    public void AddPost(User u, Post p);

    public void AddLike(User u, Post p);
}
