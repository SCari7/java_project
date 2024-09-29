package homework_06;

import java.util.Random;

public class Task2randomNum {
    /*
    Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.
Проверьте:

равны ли переменные,

не равны ли они,

больше ли a, чем b,

и меньше ли b, чем a.

Выведите результат на экран.
     */
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(51);
        int b = random.nextInt(51) - 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a равно b: " + (a == b));
        System.out.println("a не равно b: " +(a != b));
        System.out.println("a больше b: " + (a > b));
        System.out.println("b меньше a: " + (b < a));
    }
}
