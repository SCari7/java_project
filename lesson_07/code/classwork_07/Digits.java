package classwork_07;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int numbers = scanner.nextInt();
        int number1 = numbers;

        int count = 0;
        while (numbers > 0 ){
            numbers = numbers / 10;
            System.out.println(numbers);
            count++;

        }
         // 5 467
        //------------
        // 5 467 % 10 = 7 - это первая справа цифра числа
        // 5 467 / 10 - 10
        System.out.println("Digits in numbers " + numbers);
    }
}
