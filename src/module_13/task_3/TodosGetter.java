package module_13.task_3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TodosGetter {
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/users/";

    public void printOpenTodos(int userId) throws IOException, InterruptedException {
        String allTodos = getTodos(userId);
        List<UserTodos> allOpenTodos = getOpenTodos(allTodos);
        for (UserTodos element : allOpenTodos){
            System.out.println(Collections.singletonList(element));
        }
    }

    private String getTodos(int userId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create(BASE_URL + userId + "/todos"))
                .GET()
                .build();
        HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    private List<UserTodos> getOpenTodos(String json){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        UserTodos[] userTodos = gson.fromJson(json, UserTodos[].class);
        List<UserTodos> allTodos = new ArrayList<>(Arrays.asList(userTodos));
        List<UserTodos> openTodos = new ArrayList<>();
        for (UserTodos element : allTodos){
            if (!element.completed){
                openTodos.add(element);
            }
        }
        return openTodos;
    }
}
