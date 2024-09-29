package lesson_12;

public class searchValue {

    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        int counter = 0;

        while (startIndex <= endIndex) {
            counter++;
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == searchValue) {
                return middleIndex;
            }
            if (array[middleIndex] > searchValue) {
                System.out.println("Найденно за " + counter + " шагов");

                endIndex = middleIndex - 1;

            } else {
                startIndex = middleIndex + 1;

            }

        }
        System.out.println("Значение не найдено! Шагов сделанно " + counter);
        return -1;

    }
}
