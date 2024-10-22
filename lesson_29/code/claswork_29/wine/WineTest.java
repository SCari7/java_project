package claswork_29.wine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class WineTest {
    Wine[] wines;

    @BeforeEach
    void setUp() {

        wines = new Wine[5];
        wines[0] = new Wine("A1", "AAA", 2021, 6);
        wines[1] = new Wine("A2", "BBB", 2024, 3);
        wines[2] = new Wine("A3", "CCC", 2022, 5);
        wines[3] = new Wine("A4", "XXX", 2015, 7);
        wines[4] = new Wine("A5", "OOO", 2000, 20);


    }

    @Test
    void sortWineTestByAge() {
        System.out.println("-------------List Wines es is------------");
        printWines();//print es is
        Arrays.sort(wines);//sorting
        System.out.println("-------------List Wines es is------------");
        printWines();//print

    }

    @Test
    void printWines() {
        for (int i = 0; i < wines.length; i++) {
            System.out.println(wines[i]);
        }
    }

    @Test
    void sortWineByPriceTest(){
        Comparator<Wine> comparatorByPrice = new Comparator<Wine>() {
            @Override
            public int compare(Wine w1, Wine w2) {
                return Double.compare(w1.getPrice(),w2.getPrice());//(int)w1.getPrice() - w2.getPrice();
            }
        };
        System.out.println("-------------List Wines es is------------");
        printWines();//print es is
        Arrays.sort(wines, comparatorByPrice);//sorting
        System.out.println("-------------List Wines es is------------");
        printWines();//print

    }
    @Test
    void sortWinesByTitleTest(){
        Comparator<Wine> comparatorByTitle = new Comparator<Wine>() {
            @Override
            public int compare(Wine w1, Wine w2) {
                return w1.getTitle().compareTo(w2.getTitle());
            }
        };
        System.out.println("-------------List Wines es is------------");
        printWines();//print es is
        Arrays.sort(wines, comparatorByTitle);//sorting
        System.out.println("-------------List Wines es is------------");
        printWines();//print
    }
}