package module_10;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static List<User> getUsers(List<String> lines){
        List<User> users = new ArrayList<>();
        String[] aliceWords = lines.get(1).split(" ");
        String[] ryanWords = lines.get(2).split(" ");
        User alice = new User(aliceWords[0], Integer.parseInt(aliceWords[1]));
        users.add(alice);
        User ryan = new User(ryanWords[0], Integer.parseInt(ryanWords[1]));
        users.add(ryan);

        return users;
    }

    public static void main(String[] args) {
        String absolutePath = "C:\\Users\\Victor\\Desktop\\GitHub\\Java_learn\\src\\module_10\\task2.txt";
        List<String> lines = new ArrayList<>();

        File file = new File(absolutePath);
        if(!file.exists()){
            throw new RuntimeException("No such file");
        }

        try(FileReader fileReader = new FileReader(file)){
            BufferedReader reader = new BufferedReader(fileReader);
            while (reader.ready()){
                String line = reader.readLine().strip();
                lines.add(line);
            }
        }catch(IOException e){
            System.err.print(e.getMessage());
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(getUsers(lines));

        System.out.println(json);
    }
}
class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
