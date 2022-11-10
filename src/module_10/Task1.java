package module_10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Task1 {
    public static boolean isLineCorrect(String line){
        int length = line.replaceAll("\\D", "").length();
        return length == 10 && line.contains("-");
    }
    public static void main(String[] args) {
        String absolutePath = "C:\\Users\\Victor\\Desktop\\GitHub\\Java_learn\\src\\module_10\\task1.txt";
        List<String> lines = new ArrayList<>();

        File file = new File(absolutePath);
        if(!file.exists()){
            throw new RuntimeException("No such file");
        }

        try(FileReader fileReader = new FileReader(file)){
            BufferedReader reader = new BufferedReader(fileReader);
            while (reader.ready()){
                String line = reader.readLine().strip();
                if(isLineCorrect(line)){
                    lines.add(line);
                }
            }
            for(String i : lines){
                System.out.println(i);
            }

        }catch(IOException e){
            System.err.print(e.getMessage());
        }
    }
}
