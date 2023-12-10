import java.util.Scanner;

public class Task_1_Ternary_Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int smallerNumber = (number1 < number2) ? number1 : number2;
        System.out.println("Smaller Number is: " + smallerNumber);
        scanner.close();
    }
}