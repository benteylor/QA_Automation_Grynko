public class Task3VolumeOfTheCylinder {
  public static void main(String[] args) {
        double radius = 10.5; // тип данных double используем при наличии числа с плавающей точкой
        int height = 15;
        double baseArea = Math.PI * Math.pow(radius, 2);
        double cylinderVolume = baseArea * height;
        System.out.println("Объем цилиндра: " + cylinderVolume);;

    }
}