package module_11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("1. Ivan", "2. Vic", "3. Peter", "4. Max", "5. Alex")

                .map(name -> name.toUpperCase())
                .sorted((str1, str2) -> Character.compare(str2
                                .charAt(3), str1.charAt(3)));

                List<String> result = names.collect(Collectors.toList());

        System.out.println(result);
    }
}
