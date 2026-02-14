
import java.util.*;
public class ChocolateDistributionCalculator{
    public static int[] calculate(int chocolates,int children){
        return new int[]{chocolates/children,chocolates%children};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chocolates=sc.nextInt();
        int children=sc.nextInt();
        System.out.println(Arrays.toString(calculate(chocolates,children)));
        sc.close();
    }
}
