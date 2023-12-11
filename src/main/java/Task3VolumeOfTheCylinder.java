public class Task3VolumeOfTheCylinder {
    public static void main(String[] args) {
        double radius = 10.5;
        int height = 15;
        double baseArea = Math.PI * Math.pow(radius, 2);
        double cylinderVolume = baseArea * height;
        System.out.println("Объем цилиндра: " + cylinderVolume);;
    }
}