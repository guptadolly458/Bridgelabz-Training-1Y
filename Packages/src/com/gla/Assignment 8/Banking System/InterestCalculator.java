import static java.lang.Math.*;

public class InterestCalculator {

    public static double SI(double P, double R, double T) {
        return (P * R * T) / 100;
    }

    public static double CI(double P, double R, double T) {
        return P * pow((1 + R/100), T) - P;
    }

    public static void main(String[] args) {
        System.out.println("SI: " + SI(1000,5,2));
        System.out.println("CI: " + CI(1000,5,2));
    }
}