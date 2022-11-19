package module_11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    private static String[] numbers = {"1, 2, 0", "4, 5"};
    public static void main(String[] args) {
        String values = String.join(", ", numbers);
        String[] nums = values.split(", ");
        List<Integer> result = Arrays.stream(nums)
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
