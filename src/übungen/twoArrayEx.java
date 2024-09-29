package übungen;

import java.util.function.ToDoubleBiFunction;

public class twoArrayEx {
    public static void main(String[] args) {
        int[][] array = new int[9][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                //array[i] = 4;
                // TODO: как присвоить 0 другое значение в двойных массивах

                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }
}
