package homework_05;
/*
Task 1
Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
Используя Scanner, сохраните имя в переменную типа String.
Выведите на экран количество символов в имени пользователя.
Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.

 */

import java.util.Scanner;

public class Task1char_last {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");

        String input = scanner.nextLine();

        System.out.println("количество символов в имени пользователя: " + input.length());

        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() -1);
        System.out.println(firstChar + " | " +firstChar);
        System.out.println(lastChar + " | " + lastChar);


    }
}
