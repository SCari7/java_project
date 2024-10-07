package homework_04;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = convertCelsiusToFahrenheit(celsius);

        System.out.println("Температура в градусах Фаренгейта: %2F°\n" + fahrenheit);
        scanner.close();
        }
        public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
