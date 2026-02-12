import java.util.Scanner;
public class MaximumOfThree {
    static int getInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }
    static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = getInput(sc, "Enter first number: ");
        int b = getInput(sc, "Enter second number: ");
        int c = getInput(sc, "Enter third number: ");
        int max = findMaximum(a, b, c);
        System.out.println("Maximum is: " + max);
        sc.close();
    }
}
