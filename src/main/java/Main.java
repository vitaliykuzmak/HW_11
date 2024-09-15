import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Завдання 1: Імена на непарних індексах
        System.out.println("Завдання 1:");
        List<String> names = List.of("Ivan", "John", "Stepan", "Vitaliy", "Oleg");
        System.out.println(Task1.getOddIndexedNames(names));

        // Завдання 2: Імена у верхньому регістрі, відсортовані за спаданням
        System.out.println("\nЗавдання 2:");
        System.out.println(Task2.getSortedUppercaseNames(names));

        // Завдання 3: Сортування чисел з рядків
        System.out.println("\nЗавдання 3:");
        String[] arr = {"1, 2, 0", "4, 5"};
        System.out.println(Task3.getSortedNumbers(arr));

        // Завдання 4: Лінійний конгруентний генератор
        System.out.println("\nЗавдання 4:");
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        Task4.linearCongruentGenerator(0, a, c, m)
                .limit(10)
                .forEach(System.out::println);

        // Завдання 5: Перемішування двох стрімів
        System.out.println("\nЗавдання 5:");
        Stream<String> firstStream = Stream.of("A", "B", "C");
        Stream<String> secondStream = Stream.of("1", "2", "3", "4");
        Task5.zip(firstStream, secondStream)
                .forEach(System.out::println);

        System.out.println("\nПрограма завершила роботу.");
    }
}