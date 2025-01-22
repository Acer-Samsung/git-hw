public class User {
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int id =1 ;
    String name;
    String newlyadded;
    String email;

    private DB db;

    public User(DB db) {this.db = db;}


    public void newUser(String user) {
        db.getUsers().add(user + " --- id = "+ id++);
    }

    public void listUsers() {
        System.out.println("Users: " + db.getUsers());
    }

}
