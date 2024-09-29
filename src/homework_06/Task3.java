package homework_06;
/*
Task 3
Попросите пользователя ввести целое число с клавиатуры.
Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
Copy
Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
 */
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = scanner.nextInt();
        boolean isEven = (number % 2 == 0);
        boolean isEven1 = (number % 3 == 0);
        boolean isEven2 = isEven && isEven1;
        System.out.println("Число: " + number + " четное: " + isEven + "; кратно 3: "
                + isEven1 + "; четное и кратое 3: " + isEven2);


        /*
        %d
        %f
        %s
         */

        System.out.printf("6 четное: %d ; кратно 3: %s ; четное и кратное 3: %s\n", number, isEven, isEven1,isEven2 );

        System.out.printf("Test");
    }
}
