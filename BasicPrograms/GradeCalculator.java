import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        double physics = sc.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter Maths marks: ");
        double maths = sc.nextDouble();
        double average = (physics + chemistry + maths) / 3;

        System.out.println("Average Percentage = " + average);
        if (average >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remark: Level 4, above agency-normalized standards");
        } else if (average >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remark: Level 3, at agency-normalized standards");
        } else if (average >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remark: Level 2, below but approaching standards");
        } else if (average >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remark: Level 1, well below standards");
        } else if (average >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remark: Level 1, too below standards");
        } else {
            System.out.println("Grade: R");
            System.out.println("Remark: Remedial standards");
        }

        sc.close();
    }
}