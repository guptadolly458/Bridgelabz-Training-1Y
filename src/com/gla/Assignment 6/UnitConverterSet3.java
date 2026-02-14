
import java.util.*;
public class UnitConverterSet3{
    public static double fToC(double f){ return (f-32)*5/9; }
    public static double cToF(double c){ return (c*9/5)+32; }
    public static double poundsToKg(double p){ return p*0.453592; }
    public static double kgToPounds(double k){ return k*2.20462; }
    public static double gallonsToLiters(double g){ return g*3.78541; }
    public static double litersToGallons(double l){ return l*0.264172; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double v=sc.nextDouble();
        System.out.println(fToC(v));
        System.out.println(cToF(v));
        System.out.println(poundsToKg(v));
        System.out.println(kgToPounds(v));
        System.out.println(gallonsToLiters(v));
        System.out.println(litersToGallons(v));
        sc.close();
    }
}
