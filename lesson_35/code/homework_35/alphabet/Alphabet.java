package homework_35.alphabet;

import java.util.ArrayList;

public class Alphabet {
    public static void main(String[] args) {
//Мы создаём ArrayList<Character>, чтобы хранить символы.
        ArrayList<Character> alphabet = new ArrayList<>();

// Заполняем ArrayList символами от 'A' до 'Z'
//Используем цикл for, начиная с символа 'A' (или 65 в Unicode)
// и до 'Z' (или 90).
      // Заполняем ArrayList символами от 'a' до 'z' to lowerCase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            alphabet.add(ch);
        }
// Выводим результат
        System.out.println(alphabet);


    }


}
