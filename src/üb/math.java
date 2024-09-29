package üb;

public class math {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 12, 16, 20, 17, 41, 35};

       printPrimeNumbers(numbers);
    }
    public static void printPrimeNumbers(int[] array){
        System.out.print("Простые числа в массиве: ");
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])){
                System.out.print(array[i]   + ", ");
            }

        }
    }

    public static boolean isPrime(int num){
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num) ; i++) {
            if (num % i == 0) {
                return false;
            }

        }
        return true;
    }
}
