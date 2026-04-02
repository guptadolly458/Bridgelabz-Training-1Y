
import java.util.*;
public class TriangularParkRunCalculator{
    public static double calculate(double a,double b,double c){
        double perimeter=a+b+c;
        return 5000/perimeter;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(calculate(a,b,c));
        sc.close();
    }
}
