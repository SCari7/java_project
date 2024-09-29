package homework_11;

/*
Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).).
 */
public class Task2 {

    public static void main(String[] args) {
        int[] array = {43, 33, 9, 33, 43};
        System.out.println("Среднее арифметическое: " + average(array));
    }

    public static double average(int[] array) {

        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / array.length;
    }

}
