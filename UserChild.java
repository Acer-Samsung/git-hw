public class UserChild {
    public UserChild(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int id =1 ;
    String name;
    String newlyadded;
    String email;

    String phone;

    private String login;
    private String password;
    private DB db;

    public UserChild(DB db) {this.db = db;}


    public void newUsers(String user) {
        db.getUsers().add(user + " --- id = "+ id++);
    }

    public void listUsers() {
        System.out.println("Users: " + db.getUsers());
    }


}
