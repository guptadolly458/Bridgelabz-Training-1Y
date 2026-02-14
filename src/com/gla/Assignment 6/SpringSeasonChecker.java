
import java.util.*;
public class SpringSeasonChecker{
    public static boolean check(int m,int d){
        return (m==3&&d>=20)||(m>3&&m<6)||(m==6&&d<=20);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(check(m,d));
        sc.close();
    }
}
