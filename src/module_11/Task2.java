package module_11;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("1. Ivan", "2. Vic", "3. Peter", "4. Max", "5. Alex")

                .sorted(Collections.reverseOrder())
                .sorted(Comparator.comparing(str -> str.split(" ")[1]));

                List<String> result = names.collect(Collectors.toList());

        System.out.println(result);
    }
}
