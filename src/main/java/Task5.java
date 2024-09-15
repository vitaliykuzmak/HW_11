import java.util.stream.Stream;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.List;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> iterFirst = first.iterator();
        Iterator<T> iterSecond = second.iterator();

        Stream.Builder<T> builder = Stream.builder();

        while (iterFirst.hasNext() && iterSecond.hasNext()) {
            builder.add(iterFirst.next());
            builder.add(iterSecond.next());
        }

        return builder.build();
    }

    public static void main(String[] args) {
        Stream<String> firstStream = Stream.of("A", "B", "C");
        Stream<String> secondStream = Stream.of("1", "2", "3", "4");

        List<String> zippedList = zip(firstStream, secondStream).collect(Collectors.toList());
        System.out.println(zippedList);
    }
}