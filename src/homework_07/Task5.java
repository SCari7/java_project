package homework_07;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int grade = random.nextInt(13);
        int remainingTime = 45;

        System.out.println("Оценка ребенка: " + grade);

        switch (grade) {

            case 10:
            case 11:
            case 12:
                System.out.println("Мы рады плюс 1 час");
                remainingTime += 60;
                break;

            case 7:
            case 8:
            case 9:

                System.out.println("Молодец плюс 45 минут");
                remainingTime += 45;
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("Нужно учить лучше плюс 15 минут");
                remainingTime += 15;
                break;

            case 3:
                System.out.println("Оценка плохая поэтому минус 30 минут");
                remainingTime -= 30;
                break;

            default:
                System.out.println("Телевизор запрещеню");
                remainingTime = 0;
                break;

        }
        if (remainingTime > 60) {
            remainingTime = 60;
        }
        System.out.println("Оставшееся время для ТВ: " + remainingTime + " минут ");

    }
}
