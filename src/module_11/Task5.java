package module_11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("1", "2", "3", "4", "5");
        Stream<String> second = Stream.of("Vic", "Max", "Mad", "apple");

        zip(first, second).peek(System.out::println).toList();
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        List<T> listFirst = first.toList();
        List<T> listSecond = second.toList();

        int min = Math.min(listFirst.size(), listSecond.size());

        List<T> listResult = new ArrayList<>();
        for (int i = 0; i < min; i++) {
            listResult.add(listFirst.get(i));
            listResult.add(listSecond.get(i));
        }
        return listResult.stream();
    }
}
