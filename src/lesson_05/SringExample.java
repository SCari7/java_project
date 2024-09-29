package lesson_05;

public class SringExample {
    public static void main(String[] args) {
        String string = "Java"; // объявленине
        String string1 = new String ("Hello");
        System.out.println(string);


        // 1- получить  количестао символов в строке
        int length = string.length();
        System.out.println("length: " + length);

        // в верхеий регистр перевод символов

        System.out.println(string.toUpperCase());
        // усли я хочу сохранить ркзцльтат рабты метода я должен сохранить его в каклюто перемеррую
        String stringUpper = string.toUpperCase();

        System.out.println("stringUpper:" + stringUpper);
        System.out.println("string: " + string);
         stringUpper = stringUpper.toLowerCase();



    }

}
