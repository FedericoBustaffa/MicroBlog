import java.util.Date;
import java.util.Set;
import java.util.HashSet;

public class PostImpl implements Post
{
    // metadati
    private int id;
    private User author;
    private String text;
    private Date datatime;
    private Set<User> likes;

    // univocità del post
    private static int id_counter = 0;

    // costruttore
    public PostImpl(String author, String text)
    {
        // controllo che l'autore sia nella rete sociale
        // controllo che il testo sia al massimo di 140 caratteri
        if(text.length() > 140)
            throw new IllegalArgumentException();
        
        this.id = id_counter;
        id_counter += 1;

        this.author = new UserImpl(author);
        this.text = text;
        this.datatime = new Date();
        this.likes = new HashSet<User>();
    }

    // metodi
    public int GetID() { return id; }
    public User GetAuthor() { return author; }
    public String GetText() { return text; }
    public Date GetDataTime() { return datatime; }
    public Set<User> GetLikes() { return likes; }
}
