package homework_20;
/*
Напишите программу, которая запрашивает у пользователя строку,
содержащую целые числа, и выводит сумму всех этих введенных чисел.
 Используйте классы-обёртки для преобразования строк в соответствующие примитивы.
 */

import java.util.Scanner;

public class IntegersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа через пробел: ");
        String input = scanner.nextLine();

        String[] numbers = input.split("");

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);// Использование wrapper class для конвертации String в int.

        }
        System.out.println("Сумма всех простых чисел: " + sum);
    }
}
