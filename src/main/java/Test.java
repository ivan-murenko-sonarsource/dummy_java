import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        Stream.of("Hello", " ", "world", "!")
                .toList()
                .forEach(System.out::print);
    }

}
