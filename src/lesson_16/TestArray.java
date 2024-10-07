package lesson_16;

public class TestArray {
    public static void main(String[] args) {
        magicArray magicArray = new magicArray();

        System.out.println(magicArray.toString());
        magicArray.add(100);
        magicArray.add(200);
        magicArray.add(300);
        System.out.println("naw in array: " + magicArray.seize());


        magicArray.add();
        magicArray.add(500, 600, 700);

        System.out.println(magicArray.toString());

        System.out.println();
    }

}
