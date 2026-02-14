
import java.util.*;
public class NumberCheckerPart2{
    public static boolean isHarshad(int n){
        int sum=0,temp=n;
        while(temp>0){ sum+=temp%10; temp/=10; }
        return n%sum==0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isHarshad(n));
        sc.close();
    }
}
