package homework_22;

public class ArrayMethod {
    public static int sumOddIndex(int[] arr) {
        int sum = 0;
        //поиск элементов с нечетными индексами
        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];

        }
        return sum;
    }

    //поиск 5 элемента
    public static int findFifthElement(int[] arr) {
        if (arr.length >= 5) {
            return arr[4];
        } else {
            System.out.println("Массив короткий");
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Сумма элементов с нечетными индексами: " + sumOddIndex(array));
        System.out.println("5й элемент массива: " + findFifthElement(array));
    }
}
