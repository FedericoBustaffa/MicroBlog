
public class UserImpl implements User
{
    // metadati
    private String username;

    // costruttore
    public UserImpl(String username)
    {
        this.username = username;
    }

    // metodi
    public String GetUsername() { return username; }
}
