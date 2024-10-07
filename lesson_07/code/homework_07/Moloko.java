package homework_07;

import java.util.Scanner;

public class Moloko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку, например молоко: ");
        String str = scanner.nextLine();

        System.out.println("Введите число сколько раз нужно распечатать строку: ");
        int quantity = scanner.nextInt();

        while (quantity > 0) {
            System.out.println("- " + str + " :" + quantity);
            quantity--;
            System.out.println();
        }

    }
}
