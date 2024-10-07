package lesson_17;

public class catApp {
    public static void main(String[] args) {
        Cat17 cat = new Cat17("Catty", 8,5);

        cat.sayMeow();

//        System.out.println(cat.toString());

//        cat.age = -1000;

//        cat.weight = 1000;

//        cat.name = null;
        System.out.println(cat.toString());
        String name = cat.getName();
        System.out.println("name = " + name);
        System.out.println("Weight: " + cat.getWeight());
        System.out.println("Age: " + cat.getAge());

        cat.setAge(15);
        System.out.println("Age: " + cat.getAge());
        cat.setName("max");
        System.out.println(cat.toString());
        System.out.println("===============\n");
    }

}
