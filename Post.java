import java.util.Date;
import java.util.Set;

public interface Post
{
    public int GetID();
    
    public String GetAuthor();

    public String GetText();

    public Date GetDataTime();

    public Set<String> GetLikes();
}
