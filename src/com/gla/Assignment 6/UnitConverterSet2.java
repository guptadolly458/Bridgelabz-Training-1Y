
import java.util.*;
public class UnitConverterSet2{
    public static double yardsToFeet(double y){ return y*3; }
    public static double feetToYards(double f){ return f*0.333333; }
    public static double metersToInches(double m){ return m*39.3701; }
    public static double inchesToMeters(double i){ return i*0.0254; }
    public static double inchesToCm(double i){ return i*2.54; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double v=sc.nextDouble();
        System.out.println(yardsToFeet(v));
        System.out.println(feetToYards(v));
        System.out.println(metersToInches(v));
        System.out.println(inchesToMeters(v));
        System.out.println(inchesToCm(v));
        sc.close();
    }
}
