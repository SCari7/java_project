package homework_31;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
class CountryTest {
Country [] countries;
    @BeforeEach
    void setUp() {
        countries = new Country[4];


        countries[0] = new Country("Germany", 83783942);
        countries[1] = new Country("Brazil", 212559417);
        countries[2] = new Country("India", 1380004385);
        countries[3] = new Country("China", 1439323776);
    }

    private void printArray(Object[] array, String titleOfReport) {


    }



}