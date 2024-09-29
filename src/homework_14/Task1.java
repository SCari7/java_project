package homework_14;

public class Task1 {
    public static void main (String[] args){
        int[] number = {33, 13, 5, 7, 18, 47, 1, 19, 15};
        int sum = sumOfEvenNumbers(number);
        System.out.println("Сумма всех четных чисел: " + sum);

    }

    public static int sumOfEvenNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }

        }
        return sum;
    }
}
