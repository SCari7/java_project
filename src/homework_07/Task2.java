package homework_07;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand1 = random.nextInt(101);
        int rand2 = random.nextInt(101);
        int rand3 = random.nextInt(101);
        int rand4 = random.nextInt(101);
        System.out.println("Random number 1: " + rand1);
        System.out.println("Random number 2: " + rand2);
        System.out.println("Random number 3: " + rand3);
        System.out.println("Random number 4: " + rand4);
        int max = rand1;
        if (rand2 > max) {
            max = rand2;
        }
        if (rand3 > max) {
            max = rand3;
        }
        if (rand4 > max) {
            max = rand4;
        }
        System.out.println("Max number: " + max);

    }

}
