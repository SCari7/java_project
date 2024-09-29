package homework_05;
/*
Task 2
Создайте строки:
"Java"
"is"
"a"
"powerful"
"language"
Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
Выведите на экран получившуюся строку и её длину.
Task 2.2 * (Опционально)
Замените в результирующей строке слово "powerful" на "super".
Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
Выведите на экран значение этой переменной.
 */

public class Task2concat {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = " ";
        String str3 = "is";
        String str4 = " ";
        String str5 = "a";
        String str6 = " ";
        String str7 = "powerful";
        String str8 = " ";
        String str9 = "language";
        String conk = str1 + str2 + str3 + str4 + str5 + str6 + str7 + str8 + str9;


        System.out.println(conk);
        int length = conk.length();
        System.out.println("length: " + length);

        String conkStr1 = str1.concat(str2).concat(str3).concat(str4).concat(str5).concat(str6).concat(str7).concat(str8).concat(str9);
        System.out.println(conkStr1 + "; длина " + conkStr1.length());

        String result = conk.replace("powerful", "super");
        System.out.println(result + "; длина " + conk.length());


        String replaceMe = "AbAbAbAc";
        // poisk vhogdenij v stroke

        String replace1 = replaceMe.replaceFirst("Ab", "C");
        String replace2 = replaceMe.replace("Ab", "D");

        // rabota s regular vuragenia
        String replace3 = replaceMe.replaceAll("Ab", "E");
        System.out.println("replace1: " + replace1);
        System.out.println("replace2: " + replace2);
        System.out.println("replace3: " + replace3);




        // поиск чегоlibo в строке podstroki v stroke
        int index = conk.indexOf("age");
        System.out.println("index: " + index);

        //replaceMe = "AbAbAbAc"
        int indexAb1 = replaceMe.indexOf("Ab");
        System.out.println("indexAb1: " + indexAb1);
        int indexAb2 = replaceMe.lastIndexOf("Ab");
        System.out.println("indexAb2: " + indexAb2);

    }

}
