package classwork_30.sorting_Integer;

import java.util.Arrays;

public class SortingInteger {
    public static void main(String[] args) {
        Integer[] numbers = {
                -100,
                2,
                Integer.MAX_VALUE,
                2,
                15,
                Integer.MIN_VALUE,
                71
        };

        Arrays.sort(numbers, (n1, n2) -> - Integer.compare(n1, n2));
        //draft print
        System.out.println(Arrays.toString(numbers));

        int index = 0;
        for (Integer i : numbers) {
            System.out.print(i + " " + index + "| ");
            index++;
        }


    }



}
