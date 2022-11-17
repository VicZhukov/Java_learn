package module_11;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("1. Ivan", "2. Vic", "3. Peter", "4. Max", "5. Alex")
                .filter(s -> s.charAt(0)%2 != 0);

        List<String> filteredNames = names.collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
