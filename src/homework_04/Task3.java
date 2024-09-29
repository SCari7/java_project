package homework_04;
/*

Task 3 * (Опционально)
Потеря данных при преобразовании
Напишите программу, которая:

Объявляет переменную long с именем bigNumber и присваивает ей значение 15_000_000_000 (15 миллиардов).
Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
 */
public class Task3 {
    public static void main(String[] args) {

        long bigNumber = 15000000000L;
        int smallNumber = (int) bigNumber;
        // переменная типа long всегда с L
        // L
        // потеря данных потому что int меньше long
        System.out.println("smallNumber: " + smallNumber);

        byte b1 = 127;
        b1++; //= -128
        System.out.println(b1);


    }
}
