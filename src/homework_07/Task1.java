package homework_07;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2, или 3: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1:
                System.out.println("Вы ввели число: один");
                break;
            case 2:
                System.out.println("Вы ввели число: два");
                break;
            case 3:
                System.out.println("Вы ввели число: три");
            default:
                System.out.println("Вы ввели неверное число");
        }
    }
}
