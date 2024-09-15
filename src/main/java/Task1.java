import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static String getOddIndexedNames(List<String> names) {
        return names.stream()
                .filter(name -> names.indexOf(name) % 2 == 0)
                .map(name -> (names.indexOf(name) + 1) + ". " + name)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "John", "Stepan", "Vitaliy", "Oleg");
        System.out.println(getOddIndexedNames(names));
    }
}
