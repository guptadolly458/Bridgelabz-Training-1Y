
import java.util.*;
public class CollinearPointsChecker{
    public static boolean check(int x1,int y1,int x2,int y2,int x3,int y3){
        return (x2-x1)*(y3-y1)==(y2-y1)*(x3-x1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(check(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
        sc.close();
    }
}
