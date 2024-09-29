package lesson_08;

public class WhileLoop {
    public static void main(String[] args) {

         /*
        while (условие) {
           Тело цикла
           Код, который будет повторяться
        }
         */

        // Вывести на экран числа от 1 до 5

        int number = 1; // инициализация переменной
        while (number <= 5) { // Условие (приедикат) цикла
            System.out.println(number);// Действие: вывод числа
            number++;// number = number + 1;

        }

        System.out.println("End. ");
        int y = 5;


        // Бесконечный цикл
//        while (true) {
//            System.out.println("Hello World");
//        }

        // Распечатать числа от 100 до 90 включительно в порядке убывания

//        Ctrl + /

        int number1 = 100;
        while (number1 >= 90) {
            System.out.println(number1--);
            number1--;
//            i--; // i = i -1;
        }

        // Задача. Найти сумму чисел от 1 до 100.

        /*
        1. Перебрать числа от 1 до 100.
        2. Каждое число добавить в какую-то переменную, накапливающую сумму чисел
         */

        number1 = 1;// Инициализация счетчика цикла
        int sum = 0;
        while (number1 <= 100) {
            sum += number1;
            number1++;// Добавляю текущее значение i к сумме
        }
        System.out.println("Sum von 1 bis 100: " + sum);

// Вывести на экран все четные числа в диапазоне от 1 до 21
        /*
        Запустить перебор чисел от 1 до 21
        Проверить является ли число четным
            Если четное - распечатать
            Иначе - никаких действий не требуется
        Увеличить счетчик цикла
         */

        int n = 1;
        while (n <= 21) {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;

        }
// Распечатать каждый символ строки в отдельной строчке
        // Нам нужно перебрать все индексы. От 0 до len - 1.
        // На каждой итерации берем символ по индексу. Распечатывает.
        // Повторить с другим индексом

        String str = "Hello!";
        n = 0;
        while (n < str.length() - 1) {
            char ch = str.charAt(n);
            System.out.println(ch);
            n++;
        }


        System.out.println(" === Opt2 ===== \n");
        number1 = 0; // 0,1,2... len-1
        while (number1 <= str.length() - 1) {
            System.out.println(str.charAt(number1++));

        }
    }

}
