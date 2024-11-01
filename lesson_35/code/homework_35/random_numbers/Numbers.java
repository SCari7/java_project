package homework_35.random_numbers;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {

        // Создаём ArrayList<Integer> numbers и заполняем
        // его 20 случайными числами от 1 до 10 с помощью Random.

        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();//также просто List<Integer>
        // Создаем ArrayList для хранения 20 случайных чисел

        for (int i = 0; i < 20; i++) {
         //Метод nextInt(10) генерирует случайное целое число от 0 до 9 включительно.
            // Параметр 10 указывает верхний предел, но не включительно.
            // То есть, диапазон случайных чисел будет [0, 10),
            // что означает от 0 до 9.
            //К результату, возвращаемому nextInt(10), мы добавляем 1.
            //Это сдвигает диапазон случайных чисел на единицу вверх:
            numbers.add(random.nextInt(10) + 1);//от 1 до 10
            //numbers.add(random.nextInt(11)); // Генерирует от 0 до 10
        }
        System.out.println("Список с дубликатами: " + numbers);

        // Удаляем дубликаты, используя Set
        /*
        'Set' — это интерфейс в Java, представляющий коллекцию,
         которая не допускает дублирующихся элементов.
         Использование Set здесь позволяет автоматически удалить дубликаты из numbers.

         uniqueNumbers — это название переменной,
         которой присваивается новая структура данных типа Set<Integer>.
        В этой переменной мы буде м хранить уникальные элементы из списка numbers.

        HashSet хранит элементы без дубликатов и не гарантирует порядка (порядок элементов может быть произвольным).

       Когда HashSet создаётся на основе numbers, он автоматически удаляет все дубликаты,
       потому что Set хранит только уникальные значения.

         В uniqueNumbers будут храниться все уникальные значения
         из numbers (все дубликаты будут удалены).
         */
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Преобразуем Set обратно в ArrayList
        List<Integer> result = new ArrayList<>(uniqueNumbers);

        System.out.println("Список без дубликатов: " + result);

    }


}
