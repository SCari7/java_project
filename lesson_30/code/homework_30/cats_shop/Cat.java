package homework_30.cats_shop;

import java.util.Objects;
/*
На русском
Задание 1. Придумайте класс МойКласс с полями типа:

String
int
double например: Person - name, weight, age City -
name, population, area ...
или выберите тот, с которым вы делали проекты по Марафону.
Выполните с набором объектов этого класса все то,
что мы делали на занятии:

сортировка по умолчанию
сортировка по 2-м критериям
поиск в массиве с помощью Arrays.binarySearch()
 */

public class Cat implements Comparable<Cat>{
    private String name;
    private String breed;
    private double weight;
    private int age;
    private double price;

    public Cat(String name, String breed, double weight, int age, double price) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.age = age;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return Double.compare(weight, cat.weight) == 0 && age == cat.age && Double.compare(price, cat.price) == 0 && Objects.equals(name, cat.name) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, weight, age, price);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", breed='").append(breed).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", age=").append(age);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Cat cat) {
        return this.age - cat.getAge();
    }

}
