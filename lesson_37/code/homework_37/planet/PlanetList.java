package homework_37.planet;

import java.util.ArrayList;
import java.util.Comparator;

public class PlanetList {
    public static void main(String[] args) {

        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", 57.9, 0.055, 0));
        planets.add(new Planet("Venus", 108.2, 0.815, 0));
        planets.add(new Planet("Earth", 149.6, 1.0, 1));
        planets.add(new Planet("Mars", 227.9, 0.107, 2));
        planets.add(new Planet("Jupiter", 778.5, 317.8, 79));
        planets.add(new Planet("Saturn", 1433.5, 95.2, 83));
        planets.add(new Planet("Uranus", 2872.5, 14.5, 27));
        planets.add(new Planet("Neptune", 4495.1, 17.1, 14));


        // Сортировка по порядку расположения (по расстоянию до Солнца)
        /*
        Метод comparingDouble принимает ссылку на метод
        (в данном случае Planet::getMass), который возвращает значение типа double для каждого объекта.
        Возвращает компаратор, который сравнивает объекты на основе возвращаемого значения.
         */
        planets.sort(Comparator.comparingDouble(Planet::getDistanceFromSun));
        System.out.println("Список, отсортированный по расстоянию до Солнца: ");
        planets.forEach(System.out::println);
        /*
        planets.forEach(System.out::println); передает каждый элемент списка planets в метод println(),
         который выводит его на консоль.
        method references,
        то же самое, что написать
        for (Planet planet : planets) {
        System.out.println(planet);
        }
         */

        // Сортировка по алфавиту
        planets.sort(Comparator.comparing(Planet::getName));
        System.out.println("\nСписок, отсортированный по алфавиту: ");
        planets.forEach(System.out::println);


        // Сортировка по массе
        planets.sort(Comparator.comparingDouble(Planet::getMass));
        System.out.println("\nСписок, отсортированный по массе: ");
       planets.forEach(System.out::println);

        // Сортировка по количеству спутников
        planets.sort(Comparator.comparingInt(Planet::getNumberOfMoons));
        System.out.println("\nСписок, отсортированный по количеству спутников:");
        planets.forEach(System.out::println);
    }



}
