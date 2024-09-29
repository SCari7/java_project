package homework_09;
/*
Task 3 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100.
 Программа должна найти, и вывести на экран все простые числа.
 Посчитайте сколько получилось таких чисел в массиве. Простое число - число,
 которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */

import java.util.Random;

public class Task3 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
        public static void main(String[]args) {
            Random random = new Random();
                    int[] array = new int[50];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100) + 1;
            }
            System.out.println("Массив случайных чисел:");
            for (int num : array) {
                System.out.print(num + " ");
            }

                System.out.println("\nпростые числа:");
                int primeCount = 0;
            for (int num : array) {
                if (isPrime(num)) {
                    System.out.print(num + " ");
                    primeCount++;
                }

            }
            System.out.println("\nКоличество простых чисел: " + primeCount);
        }
}
