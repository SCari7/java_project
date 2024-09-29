package übungen;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int[] numbers = {13, 3, 47, 19, 4, 39, 7, 21, 41};
        int sum = sumOfPrimeNumbers(numbers);
        System.out.println("Сумма всех простых чисел: " + sum);
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static int sumOfPrimeNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                sum += array[i];
            }

        }
        return sum;
    }

}
