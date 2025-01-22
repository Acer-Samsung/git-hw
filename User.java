public class User {
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int id =1 ;
    String name;

    private String login;
    private String password;
    private DB db;

    public User(DB db) {this.db = db;}


    public void addUser(String user) {
        db.getUsers().add(user + " --- id = "+ id++);
    }

    public void listUsers() {
        System.out.println("Users: " + db.getUsers());
    }

}
