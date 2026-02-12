import java.util.Scanner;
public class PalindromeChecker {
    static String getInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }
    static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    static void displayResult(boolean result) {
        if (result)
            System.out.println("It is a Palindrome.");
        else
            System.out.println("It is NOT a Palindrome.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = getInput(sc);
        boolean result = isPalindrome(input);
        displayResult(result);
        sc.close();
    }
}
