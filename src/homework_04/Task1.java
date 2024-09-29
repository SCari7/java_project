package homework_04;
/*
Task 1
Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.
 */
public class Task1 {

    public static void main(String[] args) {


        int num = 10;
        double myDouble;
        myDouble = num;

        System.out.println("myDouble: " + myDouble);
    }
}
