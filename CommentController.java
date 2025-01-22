import java.util.Scanner;

class Comment {
    int id = 1;
    int user_id;
    String comment;
}

public class CommentController {
    public void addComment(int id, int user_id, String comment) {
        id += 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter user id: ");
        sc.nextInt();
        System.out.println("Enter comment: ");
        sc.nextLine();
    }
}
