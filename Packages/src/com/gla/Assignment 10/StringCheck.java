import java.util.function.Function;

public class StringCheck {
    public static void main(String[] args) {
        Function<String, Integer> length = s -> s.length();

        String msg = "Hello World";
        System.out.println("Length: " + length.apply(msg));
    }
}