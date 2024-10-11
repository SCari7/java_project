package classwork_20.wrapper_classes_ex;

import java.math.BigInteger;

public class WrapperClassAppl {
    public static void main(String[] args) {
        int k = 1234567890;
        System.out.println(k);
        System.out.println("----------");

        Integer integer = Integer.parseInt("1234567890");
        System.out.println(integer);

        integer = integer + 5;
        System.out.println(integer);


        int value1 = 123;
        Integer a = new Integer(value1);
        System.out.println(value1);
        System.out.println("----------------");

        //
        Integer x = 5;
        System.out.println(x * 10);


        //

        integer = 7;
        int y = x + integer;
        System.out.println(y);

        System.out.println("----------------");

        BigInteger myBigInt = new BigInteger("12345678901234567890");
        System.out.println(myBigInt);

        //sum of numbers количество цифр в числе, 2.я версия решения
        int b = 1234567890;
        // сперва нужно упаковать итн в интеджер
        Integer bInt = b;// упаковали
        // cheng
        // type

        String str = bInt.toString(); //число  сменили на тип  стринг
        int l = str.length();
        System.out.println("Number: " + b + " contains " + l + " digits ");

        System.out.println("--------------------------" +
                " ");


        System.out.println("Max value of int: " + bInt.MAX_VALUE);
        System.out.println("Max value of int: " + bInt.MIN_VALUE);

        Double d = 0.0;
        System.out.println("Max value of double: " + d.MAX_VALUE);
        System.out.println("Max value of double: " + d.MIN_VALUE);
        System.out.println("---------------------------------------");

        //Math
        int n = 20;
        Integer m = 10;

        m = n + m;
        System.out.println(m);

        n = n + m;
        System.out.println(n + 1);

        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println(circleLength);

        System.out.printf("Length of circle: %.2f ", circleLength);
        System.out.println();

        System.out.println("---------------------------");

        // Nan u Infinitive

        double p = 20 / 0.0;

        if(Double.isNaN(p) || Double.isInfinite(p)){
            System.out.println("Wrong operation, division by zero");
        } else System.out.println(p);

        System.out.println("-----------------------");
       //String to numbers

       String str1 = "0098765432100";
       long num = Long.parseLong(str1);
        System.out.println(num);




    }


}
