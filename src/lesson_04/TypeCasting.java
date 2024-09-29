package lesson_04;

public class TypeCasting {
    public static void main(String[] args) {
        byte byteVal = 123;
        int intVal;
        intVal = byteVal; // не явное преобраз типа

        double doubleVal = intVal;
        System.out.println("doubleVal: "+ doubleVal);

        double doubleVal1 = 42.9;
        int int1 = (int) doubleVal1;
        System.out.println("doubleVal1: "+ doubleVal1);
        System.out.println("int1: " + int1);


        short shortVal = (short)  int1;
        System.out.println("shortVal: " + shortVal);

        double bigDouble = 3_000_000_000_000_000_000.00;


        // weiter

        int x = 20;
        int y = 7;

        double result;
        result = x / y;
        System.out.println("result: " + result);


        // 20.0 / 7.0 --> 2.85
        result = x / 7.0;
        /*

         */

        System.out.println("result: " + result);


        result = (float) x / y; //
        System.out.println("result Float cast: " + result);

        result = x / (double) y;
        System.out.println("result double cast: " + result);
    }


}
