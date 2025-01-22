public class User {
    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    int id =1 ;
    String name;
    int age;

    private DB db;

    public User(DB db) {this.db = db;}


    public void addUser(String user) {
        db.getUsers().add(user);
        System.out.println("user added");
    }

    public void listUsers() {
        System.out.println("Users: " + db.getUsers());
    }

}
