package module_10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task3 {
    public static String[] getWords(List<String> lines){
        String[] a = lines.get(0).split(" ");
        String[] b = lines.get(1).split(" ");
        String[] c = new String[a.length + b.length];
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for(int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        return c;
    }

    public static Map<String, Integer> getUnicWords(String[] getWords){
        Map<String, Integer> result = new HashMap<>();

        for (String x : getWords) {
            int newValue = result.getOrDefault(x, 0) + 1;
            result.put(x, newValue);
        }

        return result;
    }

    public static void main(String[] args) {
        String absolutePath = "C:\\Users\\Victor\\Desktop\\GitHub\\Java_learn\\src\\module_10\\task3.txt";
        List<String> lines = new ArrayList<>();

        File file = new File(absolutePath);
        if (!file.exists()) {
            throw new RuntimeException("No such file");
        }

        try (FileReader fileReader = new FileReader(file)) {
            BufferedReader reader = new BufferedReader(fileReader);
            while (reader.ready()) {
                String line = reader.readLine().strip();
                lines.add(line);
            }
        } catch (IOException e) {
            System.err.print(e.getMessage());
        }
        System.out.println(getUnicWords(getWords(lines)));
    }
}
