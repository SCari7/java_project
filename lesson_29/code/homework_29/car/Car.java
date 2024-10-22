package homework_29.car;

import java.util.Objects;

/*
Получить сортированные списки объектов типа Car:
по моделям
по цвету
по стоимости
по году выпуска
 */
public class Car implements Comparable<Car>{
    private String model;
    private String color;
    private double price;
    private int age;

    public Car(String model, String color, double price, int age) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Double.compare(price, car.price) == 0 && age == car.age && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, price, age);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("model='").append(model).append('\'');
        sb.append(", color='").append(color).append('\'');
        sb.append(", price=").append(price);
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Car car) {
       // return this.age - car.getAge();
        return this.getModel().compareTo(car.getModel());
    }

}
