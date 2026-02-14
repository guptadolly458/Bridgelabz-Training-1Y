
import java.util.*;
public class NumberCheckerPart3{
    public static boolean isPalindrome(int n){
        String s=Integer.toString(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(isPalindrome(sc.nextInt()));
        sc.close();
    }
}
