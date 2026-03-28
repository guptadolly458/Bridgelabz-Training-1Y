import java.util.function.Predicate;

public class TempAlert {
    public static void main(String[] args) {
        Predicate<Double> isHigh = t -> t > 40;

        double temp = 45;

        if (isHigh.test(temp)) {
            System.out.println("High Temperature Alert!");
        }
    }
}