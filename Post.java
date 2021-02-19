import java.util.Date;
import java.util.List;

public interface Post
{
    public int GetID();
    
    public String GetAuthor();

    public String GetText();

    public Date GetDataTime();

    public List<User> GetLikes();
}
