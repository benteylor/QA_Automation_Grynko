import java.util.Scanner;

public class Task2RemainderOfTheDivision {
    public static void main(String[] args)
    {
        // Создаем объект Scanner для того чтобы была возможность вносить данные в консоли. как в task1
        Scanner scanner = new Scanner(System.in);
        // Выводим в консоли необходымый текст
        System.out.print("Enter the number: ");
        // Считываем внесённые данные
        int userInput = scanner.nextInt();
        /* Проверка на четность используя оператор остатка.
        Если остаток от деления на 2 равен 1, то число непарное */
        boolean isOdd = (userInput % 2 == 1);
        // Далее используем тернарный оператор для вывода соответствующего сообщения
        String message = (isOdd) ? "The number is unpaired" : "The number is paired";
        // Выводим результат в консоли
        System.out.println(message);
        scanner.close();
    }
}