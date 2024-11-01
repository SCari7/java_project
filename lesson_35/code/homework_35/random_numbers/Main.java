package homework_35.random_numbers;

import java.util.*;

public class Main {

        public static void main(String[] args) {
            Random random = new Random();
            List<Integer> numbers = new ArrayList<>();

            // Заполняем список 20 случайными числами от 1 до 10
            for (int i = 0; i < 20; i++) {
                numbers.add(random.nextInt(10) + 1);
            }

            System.out.println("Список с дубликатами: " + numbers);

            // Удаляем дубликаты, используя Set
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);
            System.out.println("Список без дубликатов: " + uniqueNumbers);
        }
    }


