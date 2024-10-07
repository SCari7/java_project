package classwork_06;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount of purchase: ");

        double sum = scanner.nextDouble();

        double discount = 0;
        if (sum > 0 && sum < 100) {
            discount = 0;
        } else if (sum > 100 && sum <= 200) {
            discount = 0.02;

        } else if (sum > 200 && sum <= 500) {
            discount = 0.05;
        } else if (sum > 500 && sum <= 1000) {
            discount = 0.1;
        } else if (sum > 1000) {
            discount = 0.2;
        }
        System.out.println(discount);


    }
}
