import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        Stream.of("Hello", " to the whole ", "world", "!")
                .toList()
                .forEach(System.out::print);
    }

}
