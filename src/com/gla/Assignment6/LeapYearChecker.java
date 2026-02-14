
import java.util.*;
public class LeapYearChecker{
    public static boolean isLeap(int y){
        return y>=1582 && ((y%4==0 && y%100!=0) || y%400==0);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(isLeap(sc.nextInt()));
        sc.close();
    }
}
