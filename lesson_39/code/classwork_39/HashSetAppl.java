package classwork_39;

import java.util.HashSet;
import java.util.Set;

public class HashSetAppl {

    public static void main(String[] args)
    {// 16 -0.75
        Set<Integer> numbers = new HashSet<>(4,0.5F);//указан собственный капасити

        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        System.out.println(numbers.size());
        System.out.println("---------------");


        for (Integer i : numbers) {
            System.out.println(i);
        }

        numbers.add(50);
        System.out.println(numbers.size());
        System.out.println("---------------");
        for (Integer i : numbers) {
            System.out.println(i);
        }

    }
}
