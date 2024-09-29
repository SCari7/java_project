package lesson_12;

import java.util.Scanner;

public class home_übung {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.print("ВВедите первое число: ");
        double num1 = scaner.nextDouble();
        System.out.println("Введите второе число: ");
        double num2 = scaner.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num2 != 0 ? num1 / num2 : Double.NaN;

        System.out.println("Результаты: ");
        System.out.println("Сложения: " + num1 + "+" + " = " + sum);

    }
}
