package module_13.task_2;

import java.io.IOException;

public class CommentsGetterTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        CommentsGetter test = new CommentsGetter();
        test.getJsonWithComments(5);
    }
}
