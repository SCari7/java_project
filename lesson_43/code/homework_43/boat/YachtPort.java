package homework_43.boat;

import java.util.*;
import java.util.stream.Collectors;

public class YachtPort {
    public static void main(String[] args) {
        List<Boat> boats = Arrays.asList(
                new Boat("Sunseeker", "UK", 2015, 40.0, "Plastic", 8000000),
                new Boat("Azimut", "Italy", 2018, 30.5, "Metal", 4500000),
                new Boat("Benetti", "Italy", 2010, 45.0, "Wood", 12000000),
                new Boat("Princess", "UK", 2016, 35.0, "Metal", 6500000),
                new Boat("Ferretti", "Italy", 2020, 32.0, "Plastic", 5000000),
                new Boat("Feadship", "Netherlands", 2019, 50.0, "Metal", 15000000)
        );

        // 1. Отобразить все яхты
        System.out.println("Все яхты: ");
        boats.forEach(System.out::println);


// 2. Отобразить яхты, сделанные из указанного материала корпуса
        String material = "Metal";
        System.out.println("\nЯхты сделанные из " + material + ":");
        boats.stream()
                .filter(boat -> boat.getHullMaterial().equalsIgnoreCase(material))
                .forEach(System.out::println);


        // 3. Отобразить яхты дороже указанной цены
        double minPrice = 6000000;
        System.out.println("\nЯхты дороже: " + minPrice + ":");
        boats.stream()
                .filter(boat -> boat.getPrice() > minPrice)
                .forEach(System.out::println);

// 4. Отобразить яхты, чей год выпуска находится в заданном диапазоне
        int startYear = 2015;
        int endYear = 2020;
        System.out.println("\nЯхты выпущенные в период с " + startYear + " по " + endYear + ":");
        boats.stream()
                .filter(boat -> boat.getYear() >= startYear && boat.getYear() <= endYear)
                .forEach(System.out::println);




        // 5. Отсортировать яхты в порядке убывания стоимости
        System.out.println("\nЯхты отсортированные по убыванию стоимости:");
        boats.stream()
                .sorted(Comparator.comparingDouble(Boat::getPrice).reversed())
                .forEach(System.out::println);

        // 6. Получить среднюю стоимость яхты из созданного набора
        double averagePrice = boats.stream()
                .mapToDouble(Boat::getPrice)
                .average()
                .orElse(0);
        System.out.println("\nСредняя стоимость яхт:" + averagePrice);

        // 7. Сколько и конкретно какие яхты под каким флагом стоят в порту
        System.out.println("\nКоличество яхт по странам:");
        Map<String, List<Boat>> boatsByCountry = boats.stream()
                .collect(Collectors.groupingBy(Boat::getCountry));
        boatsByCountry.forEach((country, boatList) -> {
            System.out.println("Страна: " + country + ", Количество яхт: " + boatList.size());
            boatList.forEach(System.out::println);
        });


    }


}
