package homework_09;
/*
Task 5
Написать метод, который принимает массив строк.
Вывести на экран все символы самой длинной строки из массива.

Пример:

{ "One", "Two", "Twenty" } ->
 */

public class Task5 {
    public static void printLongestStringChars(String[] strings){
        if (strings == null || strings.length == 0) {
            System.out.println("Массив строк пустой");
            return;
        }

        String longest = strings[0];
        for (String str : strings) {
            if (str.length()> longest.length()) {
                longest = str;
            }
        }

        for (int i = 0; i < longest.length(); i++) {
            System.out.println(longest.charAt(i));
        }
    }

    public static void main (String[] args) {
        String[] words = { "One", "Two", "Twenty" };
        System.out.println("Символы самой длинной строки:");
        printLongestStringChars(words);
    }
}
