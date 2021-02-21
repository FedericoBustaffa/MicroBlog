import java.util.Date;
import java.util.Set;
import java.util.HashSet;

public class PostImpl implements Post
{
    // metadati
    private int id;
    private String author;
    private String text;
    private Date datatime;
    private Set<String> likes;

    // univocità del post
    private static int id_counter = 0;

    // costruttore
    public PostImpl(String author, String text)
    {
        this.id = id_counter;
        id_counter += 1;
        this.author = author;
        this.text = text;
        this.datatime = new Date();
        this.likes = new HashSet<String>();
    }

    // metodi
    public int GetID() { return id; }
    public String GetAuthor() { return author; }
    public String GetText() { return text; }
    public Date GetDataTime() { return datatime; }
    public Set<String> GetLikes() { return likes; }
}
