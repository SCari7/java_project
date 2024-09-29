package homework_09;

import java.util.Random;

public class Task3_ {
    public static void main(String[] args) {
        int[] digits = new int[50];
        fillArray(digits);

    }
    public static void fillArray (int[] digits) {
        Random random = new Random();

        for (int i = 0; i < digits.length; i++) {
            digits[i] = random.nextInt(101);
            
        }
    }
}
