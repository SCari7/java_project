package übungen;

public class foreachEx {
    public static void main(String[] args) {
        int[] array = new int[10];
        String[] strArray = new String[5];


        for (int number: array){
            System.out.println(number);
        }

        for (String str: strArray){
            System.out.println(str);
        }
    }

}
