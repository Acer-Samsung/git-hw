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
        if (comment.comment == null || comment.comment.isEmpty()) {
            throw new IllegalArgumentException("Comment cannot be null or empty");
        }
        comment.id = comment.id + 1;
        db.getComments().add("Comment ID: " + comment.id + ", User ID: " + comment.user_id + ", Content: " + comment.comment); // Different logic
    }
}
