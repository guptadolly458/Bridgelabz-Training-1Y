
import java.util.*;
public class UnitConverterSet1{
    public static double kmToMiles(double km){ return km*0.621371; }
    public static double milesToKm(double miles){ return miles*1.60934; }
    public static double metersToFeet(double m){ return m*3.28084; }
    public static double feetToMeters(double f){ return f*0.3048; }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double v=sc.nextDouble();
        System.out.println(kmToMiles(v));
        System.out.println(milesToKm(v));
        System.out.println(metersToFeet(v));
        System.out.println(feetToMeters(v));
        sc.close();
    }
}
