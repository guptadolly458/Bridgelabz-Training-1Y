
import java.util.*;
public class SimpleInterestCalculator{
    public static double calculate(double p,double r,double t){ return (p*r*t)/100; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        System.out.println(calculate(p,r,t));
        sc.close();
    }
}
