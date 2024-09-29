package homework_11;

public class Task1 {

    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ints1 = {-6, 8, 5};
        int sum = sumElements(ints);
        System.out.println(sum);

        int[] intsNull = null;
        System.out.println(sumElements(intsNull));
        double[] doubles = {1,  2, 2, 3, 4.8};
        System.out.println(sumElements(doubles));
        double d1 = 4;
        System.out.println(averageArray((intsNull)));
        int[] emptyArray = new int[0];
        double averageDouble = sumElements(emptyArray);
        System.out.println("averageDouble: " + averageDouble);


    }
    // Написать метод принимающий строку и возвращающий
    public static double averageArray (int[]ints){
        if ( ints == null){
            return Integer.MIN_VALUE;

        }
        double sum  = sumElements(ints);
        double average = sum / ints.length;
        return average;
    }

    public static int sumElements(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("В метод передан не корректный массив");
            return Integer.MIN_VALUE;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }

        return sum;
    }

    public static double sumElements(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        return sum;
    }


}
