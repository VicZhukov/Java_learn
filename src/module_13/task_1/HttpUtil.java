package module_13.task_1;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpUtil {
    private static final Gson GSON = new Gson();
    private static final String BASE_URl = "https://jsonplaceholder.typicode.com/users";
    private static final HttpClient CLIENT = HttpClient.newHttpClient();

    public static String sendPost(User user) throws IOException, InterruptedException {
        String requestBody = GSON.toJson(user);
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(BASE_URl))
                .headers("content-type", "application/json; charset=UTF-8")
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    public static String sendPut(int userId, User user) throws IOException, InterruptedException {
        String requestBody = GSON.toJson(user);
        String uri = BASE_URl + "/" + userId;
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(uri))
                .headers("content-type", "application/json; charset=UTF-8")
                .PUT(HttpRequest.BodyPublishers.ofString(requestBody))
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    public static int sendDelete(int userId) throws IOException, InterruptedException {
        String uri = BASE_URl + "/" + userId;
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(uri))
                .DELETE()
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response.statusCode();
    }
    public static String sendGetAllUsers() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(BASE_URl))
                .GET()
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    public static String sendGetUserById(int userId) throws IOException, InterruptedException {
        String uri = BASE_URl + "/" + userId;
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
    public static String sendGetUserByUserName(String userName) throws IOException, InterruptedException {
        String uri = BASE_URl + "?username=" + userName;
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(uri))
                .GET()
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
