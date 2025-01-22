import java.util.ArrayList;
import java.util.List;

public class DB {
    private String dbName;
    private List<String> users = new ArrayList<>();
    private List<String> comments = new ArrayList<>();

    public List<String> getUsers() {
        return users;
    }

    public List<String> getComments() {
        return comments;
    }
}
