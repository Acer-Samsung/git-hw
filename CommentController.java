import java.util.Scanner;

class Comment {
    int id = 1;
    int user_id;
    String comment;

    public Comment(int user_id, String comment) {
        this.user_id = user_id;
        this.comment = comment;
    }
    public Comment(){}
}

public class CommentController {

    public CommentController(DB db) {this.db =db;}

    private DB db;

    public void addComment(Comment comment) {
        comment.id = comment.id + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter user id: ");
        comment.user_id = sc.nextInt();
        System.out.println("Enter comment: ");
        Scanner sc2 = new Scanner(System.in);
        comment.comment = sc2.nextLine();
        db.getComments().add("id = "+ comment.id + " userid = " + comment.user_id + " comment = " + comment.comment);
    }
}
