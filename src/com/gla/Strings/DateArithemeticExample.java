import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmeticExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();
        LocalDate date = LocalDate.parse(inputDate);
        LocalDate updatedDate = date.plusDays(7)
                                    .plusMonths(1)
                                    .plusYears(2);
        updatedDate = updatedDate.minusWeeks(3);
        System.out.println("Final Date after calculations: " + updatedDate);
        sc.close();
    }
}
