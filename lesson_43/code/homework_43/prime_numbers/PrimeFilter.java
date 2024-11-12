package homework_43.prime_numbers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeFilter {
    public static void main(String[] args) {

      
        List<Integer> numbers = Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
      
      
        List<Integer> primes = numbers.stream()
                .filter(PrimeFilter::isPrime)
                .collect(Collectors.toList());
        System.out.println("Простые числа: " + primes);



    }
    // Метод для проверки, является ли число простым
    private static boolean isPrime(int number) {
        //числа меньше или равные 1 не считаются простыми.
        //Простые числа — это натуральные числа больше 1, которые делятся только на 1 и на себя.
        if (number <= 1) return false;
        // начинается цикл for, который идет от 2 до квадратного корня числа number, с шагом 1.
        //Почему до квадратного корня?
        //
        //Если число number можно разделить на какое-то число i, то результат деления
        // number / i даст второй делитель. Один из этих делителей
        // всегда будет меньше или равен квадратному корню из number.
        for (int i = 2; i <Math.sqrt(number) ; i++) {
            //number % i == 0
            //Внутри цикла мы проверяем, делится ли number на i без остатка с помощью оператора %.
            //Если number % i == 0, это значит, что number имеет делитель i, отличный от 1 и самого number,
            // поэтому оно не является простым, и метод возвращает false.
            if (number % i == 0) return false;
        }
        return true;
    }


}
