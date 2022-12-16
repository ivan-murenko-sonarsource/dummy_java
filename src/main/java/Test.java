import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        Stream.of("Hello", " ", "world", "!")
          .collect(Collectors.toList())
          .forEach(System.out::print);
    }

    private static void run() {
        String someString = new String("abc");
        System.out.println(someString);
    }

}
