import java.util.Date;
import java.util.List;

public interface Post
{
    public int GetID();
    
    public User GetAuthor();

    public String GetText();

    public Date GetDataTime();

    public List<String> GetLikes();
}
