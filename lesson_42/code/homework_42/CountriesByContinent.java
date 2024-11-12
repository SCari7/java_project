package homework_42;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountriesByContinent {
    public static void main(String[] args) {
        Map<String, List<String>> countriesByContinent =new HashMap<>();
        countriesByContinent.put("Europe", Arrays.asList("Germany", "France", "Italy", "Spain"));
        countriesByContinent.put("Australia/Oceania", Arrays.asList("Australia", "New Zealand", "Fiji"));
        countriesByContinent.put("Africa", Arrays.asList("Nigeria", "Egypt", "South Africa", "Kenya"));
        countriesByContinent.put("Asia", Arrays.asList("China", "India", "Japan", "South Korea"));
        countriesByContinent.put("North America", Arrays.asList("USA", "Canada", "Mexico"));
        countriesByContinent.put("South America", Arrays.asList("Brazil", "Argentina", "Chile"));

// Подсчет количества стран на каждом континенте
        Map<String, Integer> countryCountByContinent = new HashMap<>();
        for (String continent : countriesByContinent.keySet()) {
            List<String>  countries = countriesByContinent.get(continent);
            countryCountByContinent.put(continent,countries.size());

        }

        // Вывод количества стран на каждом континенте
        for (String continent : countryCountByContinent.keySet()) {
            System.out.println("Континент: " + continent + ", Количество стран: "
                    + countryCountByContinent.get(continent));
        }



    }


}
