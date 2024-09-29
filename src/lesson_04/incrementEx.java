package lesson_04;

public class incrementEx {
    public static void main(String[] args) {
        int var = 5;
        var = var +5;

        var += 5;
        System.out.println("var: " + var);

        char letter = 97;
        System.out.println("letter: " + letter);

        var ++;// var += 1; // var = var + 1;
        var--; // var -= 1; // var= var - 1;
        System.out.println();
        System.out.println("var: " + var);


    }
}
