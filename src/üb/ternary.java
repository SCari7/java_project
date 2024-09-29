package üb;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int max = (a > b) ? a : b;//проверка какое значение большее.
        System.out.println(max);

        int num = 67;
        String result = (num % 2 == 0) ? "Четное" : "Нечетное";
        System.out.println(result);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String day = scanner.nextLine().trim().toLowerCase();

        String dayType = (day.equals("суббота") || day.equals("воскресенье")) ? "Выходной день":"Рабочий день";
        System.out.println(dayType);


    }


}
