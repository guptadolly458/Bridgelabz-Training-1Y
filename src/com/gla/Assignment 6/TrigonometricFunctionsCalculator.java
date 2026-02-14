
import java.util.*;
public class TrigonometricFunctionsCalculator{
    public static double[] calculate(double angle){
        double rad=Math.toRadians(angle);
        return new double[]{Math.sin(rad),Math.cos(rad),Math.tan(rad)};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double angle=sc.nextDouble();
        System.out.println(Arrays.toString(calculate(angle)));
        sc.close();
    }
}
