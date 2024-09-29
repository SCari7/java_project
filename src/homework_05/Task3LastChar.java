package homework_05;

import java.util.Scanner;

public class Task3LastChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();

        int indexMidl = string.length() / 2 - 1;

        char first = string.charAt(indexMidl);
        char second = string.charAt(indexMidl + 1);
        System.out.println(first);
        System.out.println(second);

        String subStr = string.substring(indexMidl, indexMidl + 2);
        System.out.println("subStr: " + subStr);


    }

}


