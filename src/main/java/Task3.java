import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static String getSortedNumbers(String[] arr) {
        return Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        System.out.println(getSortedNumbers(arr));
    }
}
