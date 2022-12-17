package module_13.task_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommentsGetter {
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    public void getJsonWithComments(int userId) throws IOException, InterruptedException {
        String usersPosts = getPostsByUserId(userId);
        List<String> postsIds = getPostIds(usersPosts);
        int lastPostId = getLastPostId(postsIds);
        String allComments = getCommentsFromLastPost(lastPostId);
        String filePath = "src/module_13/task_2/" + "user-" + userId + "-post-" + lastPostId + "-comments.json";
        createJsonWithComments(allComments, filePath);
        System.out.println("Path to Json file: " + filePath);
    }

    private String getPostsByUserId(int userId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(BASE_URL + "users/" + userId + "/posts"))
                .GET()
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private List<String> getPostIds(String text){
        List<String> ids = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\\"id\": \\d+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            ids.add(matcher.group());
        }
        return ids;
    }

    private int getLastPostId(List<String> postIds){
        String lastId = postIds.get(postIds.size() - 1);
        String[] parts = lastId.split(" ");
        return Integer.parseInt(parts[1]);
    }

    private String getCommentsFromLastPost(int postId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(BASE_URL + "posts/" + postId + "/comments"))
                .GET()
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private UserComment[] getCommentsFromJson(String json){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(json, UserComment[].class);
    }

    private void createJsonWithComments(String text, String filePath){
        UserComment[] comments = getCommentsFromJson(text);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String outputString = gson.toJson(comments);
        try (FileWriter output = new FileWriter(filePath)) {
            output.write(outputString);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
