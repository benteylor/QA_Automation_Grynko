import java.util.Scanner;

public class Task2RemainderOfTheDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int userInput = scanner.nextInt();
        boolean isOdd = (userInput % 2 == 1);
        String message = (isOdd) ? "The number is unpaired" : "The number is paired";
        System.out.println(message);
        scanner.close();
    }
}