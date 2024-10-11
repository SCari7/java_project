package homework_20;
/*
 Разработайте приложение, которое принимает от пользователя строку
 (некое предложение, например: "Мама мыла раму.") и выводит:

количество символов в строке;
количество символов в верхнем регистре;
количество цифр в строке;
количество пробелов в строке (код пробела = 32);
в зависимости от последнего символа в строке сообщает, какое это предложение:
повествовательное;
вопросительное;
восклицательное. Используйте методы класса Character.
 */

import java.util.Scanner;

public class TypeOfSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите некое предложение: ");
        String input = scanner.nextLine();

        int charCount = input.length();
        int upperCaseCount = 0;
        int digitsCount = 0;
        int spaseCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)){
                upperCaseCount++;

            }
            if (Character.isDigit(ch)){
                digitsCount++;
            }
            if (ch == ' '){
                spaseCount++;
            }

            char lastChar = input.charAt(input.length() -1);
            String sentenceType = "";

            if (lastChar == '.'){
                sentenceType = "Declarative sentence.";
            }else if (lastChar == '?'){
                sentenceType = "Interrogative sentence.";
            } else if (lastChar == '!'){
                sentenceType = "Exclamatory sentence";
            }
            System.out.println("Nuber of character: " + charCount);
            System.out.println("Number of uppercase letters: " + upperCaseCount);
            System.out.println("Number of digits: " + digitsCount);
            System.out.println("Number of spaces: " + spaseCount);
            System.out.println("Sentence type: " + sentenceType);
        }
    }
}
