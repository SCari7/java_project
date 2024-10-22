package homework_29.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class CarTest {
    Car[] cars;

    @BeforeEach
    void setUp() {
        cars = new Car[5];
        cars[0] = new Car("A3", "Red", 30000, 2021);
        cars[1] = new Car("A2", "Green", 34000, 2022);
        cars[2] = new Car("A1", "Wise", 40000, 2023);
        cars[3] = new Car("A4", "Black", 38000, 2024);
        cars[4] = new Car("A5", "Braun", 32000, 2019);

    }
    @Test
    void printCars(){
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
    @Test
    void sortCarsByAge(){
        Comparator<Car> comparatorByAge = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return Integer.compare(c1.getAge(), c2.getAge());

            }
        };//Todo
        System.out.println("--------Cars--------");
        printCars();
        Arrays.sort(cars, comparatorByAge);
        System.out.println("-----Cars by Age------");
        printCars();
    }
    @Test
    void sortCarsByPriceTest(){
        Comparator<Car> comparatorByPrice = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return Double.compare(c1.getPrice(), c2.getPrice());
            }
        };
        System.out.println("--------Cars--------");
        printCars();
        Arrays.sort(cars, comparatorByPrice);
        System.out.println("-----Cars by Price------");
        printCars();

    }
    @Test
    void sortCarsByColorTest(){
        Comparator<Car> comparatorByColor = new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                return c1.getColor().compareTo(c2.getColor());
            }
        };
        System.out.println("--------Cars--------");
        printCars();
        Arrays.sort(cars, comparatorByColor);
        System.out.println("-----Cars by Color------");
        printCars();
    }
    @Test
    void sortCarsByModel(){
//        Comparator<Car> comparatorByModel = new Comparator<Car>() {
//            @Override
//            public int compare(Car c1, Car c2) {
//                return c1.getModel().compareTo(c2.getModel());
//            }
//        };
        System.out.println("--------Cars--------");
        printCars();
        Arrays.sort(cars);
        System.out.println("-----Cars by Model------");
        printCars();
    }



}