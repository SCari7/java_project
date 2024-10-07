package classwork_06;
/*
поиск минимального значения с помощью тернарного оператора
 */

import java.util.Scanner;

public class TernaryEx {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;

        int min = (a < b) ? a : b;//ternary operator

        System.out.println("Min: " + min);

        int max = (a > b) ? a : b;
        System.out.println("Max: " + max);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input data 1: ");

//        int number = scanner.nextInt();
//        String str = scanner.nextLine();
//        char ch = scanner.next().charAt(0);
        a = scanner.nextInt();
        System.out.println("Input data 2: ");
        b = scanner.nextInt();

        min = min(a,b);
        System.out.println("Min: " + min);

    }
    public static int min(int a, int b){
        return (a < b) ? a : b;
    }
}
