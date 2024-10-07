package homework_16;

public class MagicApp {
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5, 6, 7};

        MagicArray2 magicArray2 = new MagicArray2(test);

//        magicArray2.array = new int[10000];
//        magicArray2.cursor = 1_000_000;
//        magicArray2.array = new int[]{1,2,3};
        test[0] = 100000;

        System.out.println(magicArray2.toString());
    }
}
