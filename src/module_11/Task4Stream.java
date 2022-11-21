package module_11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4Stream {
    public static void main(String[] args) {
        Task4 rand = new Task4(25214903917l,2^48);
        Stream<Long> stream =
                Stream.iterate(11l, (seed) -> rand.c(seed).next()
                );
        stream
                .limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
