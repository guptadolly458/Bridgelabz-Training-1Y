
import java.util.*;
public class QuotientAndRemainderCalculator{
    public static int[] calculate(int n,int d){
        return new int[]{n/d,n%d};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(Arrays.toString(calculate(n,d)));
        sc.close();
    }
}
