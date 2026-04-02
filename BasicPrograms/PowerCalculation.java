public class PowerCalculation {
    public static void main(String[] args) {
        double base = Double.parseDouble(args[0]);
        double exponent = Double.parseDouble(args[1]);

        double result = Math.pow(base, exponent);
        System.out.println("Result = " + result);
    }
}