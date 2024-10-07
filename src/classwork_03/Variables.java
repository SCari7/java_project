package classwork_03;

public class Variables {
    public static void main(String[] args) {

        int myFirstVariable; //переменная ink

        myFirstVariable = 1; // присвоение значения  инициализация

        int mySecondVariable = 25;

        System.out.println(mySecondVariable);

        mySecondVariable = 50;

        System.out.println("значение переменной: " + mySecondVariable);

        // byte
        byte byteVariable = 125; // byte
        byteVariable = 0;
        byteVariable = 45;
        System.out.println("значение переменной byteVariable: " + byteVariable);

        short shortVar;
        shortVar = 31000;
        System.out.println("Short value:" + shortVar);

long longVar = 2_100_000_000_000_000_000L;
// указать что число типа long  = L

        double doubleVar = 10.5421;
        System.out.println("Doble variable: " + doubleVar);

        float floatVar = 11.65F; // нужно явно указать F


    }
}
