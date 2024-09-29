package homework_08;
/*
Task 1
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран
 */

public class Task1 {
    public static void main(String[] args) {
        long y = 1;
       int i = 1;

        while  (i <= 15) {
            y *= i;
            i ++;

        }
        System.out.println("произведение всех чисел от 1 до 15: " + y);
    }
}
