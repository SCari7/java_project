package homework_08;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int len = 5 + random.nextInt(11);
        int[] array = new int[len];

        int i = 0;
        int arrayLength = args.length;


        while (i < arrayLength) {
            array[i] = random.nextInt(101)- 50;
            System.out.println(array[i] + ", ");
            i++;
        }

    }
}
