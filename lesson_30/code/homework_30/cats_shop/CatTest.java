package homework_30.cats_shop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    Cat[] cats;


    @BeforeEach
    void setUp() {
        cats = new Cat[]{
                new Cat("Violet", "C1", 2.300, 4, 1.200),
                new Cat("Poll", "B1", 1.300, 1, 2.200),
                new Cat("Bars", "D1", 3.300, 2, 1.100),
                new Cat("Tommy", "A1", 4.300, 3, 4.200),

        };
    }

    public void printArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    @Test
    void testByNativeSorting() {
        System.out.println("-----------Print---------");
        printArray(cats);
        Arrays.sort(cats);
        System.out.println("-------Print after native sorting by Age-----");
        printArray(cats);
    }

    @Test
    void testSortingByPriceAndBreed() {
        Comparator<Cat> comparatorByPriceAndBreed = new Comparator<Cat>() {
            @Override
            public int compare(Cat cat1, Cat cat2) {
                int res = cat1.getBreed().compareTo(cat2.getBreed());
                return res != 0 ? res : Double.compare(cat1.getPrice(), cat2.getPrice());
            }
        };
        System.out.println("-----------Print---------");
        printArray(cats);
        Arrays.sort(cats, comparatorByPriceAndBreed);
        System.out.println("-------Print after sorting-----");
        printArray(cats);
    }

    @Test
    void testSortingByName() {
        Comparator<Cat> comparatorSortingByName = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println("-----------Print---------");
        printArray(cats);
        Arrays.sort(cats, comparatorSortingByName);
        System.out.println("--------Print after sorting by Name-----");
        printArray(cats);
    }
    @Test
    void testSortingByWeight(){
//        Comparator<Cat> comparatorSortingByWeight = new Comparator<Cat>() {
//            @Override
//            public int compare(Cat o1, Cat o2) {
//                return Double.compare(o1.getWeight(),o2.getWeight());
//            }
//        };
        System.out.println("-----------Print---------");
        printArray(cats);
        Arrays.sort(cats, (c1,c2) -> Double.compare(c1.getWeight(), c2.getWeight()));
        System.out.println("-------Print after sorting by Weight-----");
        printArray(cats);
    }
//    @Test
//    void testSortingByAge(){
//        Comparator<Cat> comparatorSortingByAge = new Comparator<Cat>() {
//            @Override
//            public int compare(Cat o1, Cat o2) {
//                return Integer.compare(o1.getAge(),o2.getAge());
//            }
//        };
//        System.out.println("-----------Print---------");
//        printArray(cats);
//        Arrays.sort(cats, comparatorSortingByAge);
//        System.out.println("-----------Print after sorting by Age-----");
//        printArray(cats);
//
//    }

    @Test
    void testArrayBinarySearch(){
        System.out.println("-----------Print---------");
        printArray(cats);
        Arrays.sort(cats, (c1,c2) -> (c1.getAge() - c2.getAge()));
        System.out.println("------Print after binary Search-----");
        printArray(cats);

        Cat pattern = new Cat(null,null,0,4, 0);

        int index = Arrays.binarySearch(cats, pattern,  (c1,c2) -> (c1.getAge() - c2.getAge()));

        System.out.println("Index = " + index);

    }

/*
 private String name;
    private String breed;
    private double weight;
    private int age;
    private double price;
 */
}
