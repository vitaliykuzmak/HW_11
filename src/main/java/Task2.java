import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> getSortedUppercaseNames(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "John", "Stepan", "Vitaliy", "Oleg");
        System.out.println(getSortedUppercaseNames(names));
    }
}
