package lesson_15;

public class MainCats {
    public static void main(String[] args) {

        Cat cat = new Cat(); //создаем объект класса Cat

        /*
        физически создается объект в памяти
        2 вызывается конструктор классов для инициализации свойств объекта

         */
        cat.sayMeow();
        cat.sleep();
        cat.ran();

        /*
        при создании обьектов классов все его поля инициализируюются по умолчанию
        для числовых 0 0.0
        для boolean false
        для ссылочных (String) null
         */
        String catName = cat.name;
        System.out.println("Name: " + catName);
        System.out.println("Age: " + cat.age);


        System.out.println("==========================\n");
        Cat cat1= new Cat("max");
        //удет создан новый объект класса кат

        System.out.println("Color: " + cat1.color);
        System.out.println("Name: " + cat1.name);

        System.out.println("=================\n");
        Cat cat2 = new Cat("Leo", "red");
        cat2.whoAm();
        Cat bars = new Cat("Bars", "white", 2);
        bars.whoAm();

    }


}
