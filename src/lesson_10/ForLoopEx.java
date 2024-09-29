package lesson_10;

import java.util.Random;

public class ForLoopEx {
    public static void main(String[] args) {
        /*
        for (блок инициализации, блок проверок, блок изменений) {
        ** тело цикла


         */
        //
        int j = 0;
        while (j <= 10) {
            System.out.print(j + ", ");
            j++;
        }
        System.out.println("\n End " + j);
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + "; ");

        }
        System.out.println("\nEnd for loop");
        //не один из блококов фор не являются обязательными

        int i1 = 5;
        for (i1 = 0; i1 >= 0; i1 = i1 + 1000) {
            System.out.print(i1 + ", ");

        }
        System.out.println();
        System.out.println("i1 = " + i1);

        for (String str = "Hello"; str.length() < 10; str += "€") {
            System.out.println(str);
        }
        System.out.println("Продолжение кода");

        int k = 14;
        for (int a = 0, f = 1; k >= 0 && f < 1; k--, a = ++a + k, f++) {
            System.out.println(k + " : " + a + " : " + f);
        }
        System.out.println("\n======================");

        Random random = new Random();
        int[] inta = new int[random.nextInt(11) + 5];
        System.out.println("Длинна массива: " + inta.length);

        System.out.print("[");
        for (int i = 0; i < inta.length; i++) {
            inta[i] = random.nextInt(101) - 50;// -50 do 50
            System.out.print  (inta[i] + (i < inta.length - 1 ? ", " : "]\n"));

        }

        //continue break


    }
}
