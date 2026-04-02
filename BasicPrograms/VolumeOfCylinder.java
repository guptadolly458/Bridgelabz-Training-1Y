public class VolumeOfCylinder {
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume = " + volume);
    }
}