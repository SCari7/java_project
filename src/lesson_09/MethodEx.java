package lesson_09;

public class MethodEx {
    public static void main(String[] args) {
        sayHallo();
        sayHallo();
        sayHallo();

        String string = "Java";

        //       System.out.println(string);

        saySomething("Java");

        char ch = 'A';
        char anotherChar = 'B';
        printDecimalCodeChar(ch);
        printDecimalCodeChar('J');
        System.out.println("==================");

        int[] array = {1, 34, 55, 66, 77, 432, 0};
        printArray(array);
        int[] array2 = {1, 2, 5, 67, 89, 345};
        printArray(array2);
        array[0]= 100000000;
        array[3]= 1010101010;
        printArray(array);

    }// method area

    public static void printArray(int[] array){
        System.out.println("[");

        int i = 0;
        while (i< array.length) {
            System.out.println(array[i] + ((i < array.length - 1) ? ", ": "]\n"));
            i++;
        }
    }

    public static void printDecimalCodeChar(char ch1) {
        System.out.println((int) ch1);
    }

    public static void saySomething(String text) {
        System.out.println(text);


    }


    public static void sayHallo() {
        System.out.println("Hello");

    }


}//end

