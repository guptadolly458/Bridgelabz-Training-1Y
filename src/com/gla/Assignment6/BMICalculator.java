
import java.util.*;
public class BMICalculator{
    public static double bmi(double w,double h){
        h/=100;
        return w/(h*h);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++){
            double w=sc.nextDouble();
            double h=sc.nextDouble();
            System.out.println(bmi(w,h));
        }
        sc.close();
    }
}
