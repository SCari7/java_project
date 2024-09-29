package übungen;

public class arrayEx {
    public static void main(String[] args) {
        int[] array = new int[5];
       // int[]  array1 = {11, 33, 44,};

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i]);
        }

        String[] strArray = {"one", "two", "three"};
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);

        }

        strArray[2] = "Twenty";
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);

        }

    }

}
