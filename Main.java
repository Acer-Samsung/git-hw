import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();
        User user = new User(db);
        CommentController commentController = new CommentController(db);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose an option:\n" +
                    "1. Add User\n" +
                    "2. Add Comment\n" +
                    "3. View Users\n" +
                    "4. View Comments\n" +
                    "5. Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    user.addUser(userName);
                    System.out.println("User added successfully.");
                    break;

                case "2":
                    if (db.getUsers().isEmpty()) {
                        System.out.println("No users available. Add a user first.");
                    } else {
                        Comment comment = new Comment();
                        commentController.addComment(comment);
                        System.out.println("Comment added successfully.");
                    }
                    break;

                case "3":
                    System.out.println("Users: " + db.getUsers());
                    break;

                case "4":
                    System.out.println("Comments: " + db.getComments().toString());
                    break;

                case "5":
                    System.out.println("Exiting program...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 5.");
            }
        }

        System.out.println("Final Users: " + db.getUsers());
        System.out.println("Final Comments: " + db.getComments());

    }

    private int random(int min, int max) { return (int) (Math.random() * ((max - min) + 1)) + min; };
}
