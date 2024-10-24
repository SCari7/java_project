package homework_30.sorting_double;

import java.util.Arrays;

public class SortingDouble {
    public static void main(String[] args) {
//        Double[] array = new Double[10];

        Double[] numbers = {
                11.0,
                3.0,
                22.0,
                15.0,
                7.0,
                Double.MAX_VALUE,
                8.0,
                Double.MIN_VALUE,
                9.0,
                10.0
        };
        Arrays.sort(numbers, (n1,n2) -> Double.compare(n1,n2));
        System.out.println(Arrays.toString(numbers));

        int index = 0;
        for (Double i : numbers) {
            System.out.print(i + ", " + index + " | ");
            index++;
        }

    }
}
