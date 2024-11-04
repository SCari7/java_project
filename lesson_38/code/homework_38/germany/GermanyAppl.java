package homework_38.germany;

import java.util.Collections;
import java.util.LinkedList;

public class GermanyAppl {
    public static void main(String[] args) {
        LinkedList<String> germanCapitals = new LinkedList<>();
        germanCapitals.add("Берлин");
        germanCapitals.add("Мюнхен");
        germanCapitals.add("Штутгарт");
        germanCapitals.add("Дюссельдорф");
        germanCapitals.add("Дрезден");
        germanCapitals.add("Киль");
        germanCapitals.add("Майнц");
        germanCapitals.add("Потсдам");
        germanCapitals.add("Бремен");



        // Добавление города Гамбург в начало, середину и конец списка
        germanCapitals.addFirst("Гамбург");
        int middleIndex = germanCapitals.size() / 2;
        germanCapitals.add(middleIndex, "Гамбург");
        germanCapitals.addLast("Гамбург");

        // Печать списка после добавления Гамбурга
        System.out.println("Список после добавления Гамбурга:");
        for (String city : germanCapitals) {
            System.out.println(city);
        }

        // Сортировка по алфавиту
        //Collections.sort(): сортирует список по алфавиту.

        /*
        Как работает Collections.sort():
      По естественному порядку: Если список содержит элементы,
      которые реализуют интерфейс Comparable
      (например, String, Integer и другие встроенные классы),
      метод Collections.sort() сортирует их по естественному порядку (например, для строк — лексикографически).
      С использованием компаратора: Можно передать свой компаратор
      в метод для сортировки по специфическим правилам, если требуется нестандартный порядок.
         */
        Collections.sort(germanCapitals);
        System.out.println("\nСписок отсортирован по алфавиту:");
        for (String city : germanCapitals) {
            System.out.println(city);
        }

        // Сортировка в обратном алфавитном порядке
        Collections.sort(germanCapitals, Collections.reverseOrder());
        System.out.println("\nСписок отсортирован в обратном порядке:");
        for (String city : germanCapitals) {
            System.out.println(city);
        }


    }



}
