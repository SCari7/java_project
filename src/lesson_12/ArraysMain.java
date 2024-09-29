package lesson_12;

import java.util.Arrays;
import java.util.Random;

public class ArraysMain {
    public static void main(String[] args) {

        int[] ints = {34, 21, 67, 41, 10, 80, 0, 87, 99, 38, 57, 3, 77};
        System.out.println(ints.length);
        int index = ArraysUtils.linearSearch(ints, 100);
        System.out.println("index: " + index);

        System.out.println("Массив сортировки: ");
        System.out.println(Arrays.toString(ints));
        ArraysUtils.sortSelection(ints);

        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(ints));

        int number = 87;
        int idx = ArraysUtils.binarySearch(ints, number);
        System.out.println("Индекс числа в массиве " + idx);

        int[] testArray = new int[100_000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(100_001);

        }

        //ArraysUtils.sortSelection(testArray);
        Arrays.sort(testArray);
        number = 10_000;
        idx = ArraysUtils.binarySearch(testArray, number);
        System.out.println(" index: " + idx);
        idx = ArraysUtils.linearSearch(testArray, number);
        System.out.println(" index 2: " + idx);


    }
}
