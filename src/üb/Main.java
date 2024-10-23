package üb;

public class Main {
    public static void main(String[] args) {
        Double[] array = new Double[10]; // Создаем массив на 10 элементов
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random(); // Заполняем массив случайными значениями
        }

        // Выводим массив на экран
        for (Double num : array) {
            System.out.println(num);
        }
    }
}

