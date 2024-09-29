package homework_10;
/*
Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой
и самой длинной строки изначального массива.
 */

public class Task2 {
    public static void main(String[] args) {
        String[] array = {"This", "is", "an", "orange"};
        String[] result = findShortestAndLongest(array);
        System.out.println("Самая короткая строка: " + result[0]);
        System.out.println("Самая длинная строка: " + result[1]);
    }

    public static String[] findShortestAndLongest(String[] array) {
        if (array == null || array.length == 0) {
            return new String[]{"", ""};

        }
        String shortest = array[0];
        String longest = array[0];
        for (String str : array) {
            if (str.length() < shortest.length()) {
                shortest = str;
            } if (str.length() > longest.length()){
                longest = str;
        }

        }
        return  new String[] {shortest, longest};
    }
}
