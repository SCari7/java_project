package lesson_16;

import lesson_15.Cat;

public class lesson16 {
    public static void main(String[] args) {
        Cat catVar = new Cat();

        catVar.whoAm();
        System.out.println(catVar.name);

        catVar.name = "Jack";

        System.out.println(catVar.name);

        catVar.whoAm();
        Cat barsik = new Cat("Barsik", "gray", 3);
        barsik.whoAm();
        System.out.println("color: " + barsik.color);
        System.out.println("Name: " + barsik.name);
        System.out.println("age: " + barsik.age);
        barsik.age = 12;
        barsik.whoAm();

        System.out.println("====================================\n");
        Cat cat1 = new Cat("Barsik", "gray", 3);
        cat1.whoAm();

        Cat catClone = cat1;
        catClone.whoAm();

        cat1.age = 101;
        cat1.whoAm();
        catClone.whoAm();
        System.out.println(catClone.age);
        catClone.name = "max";
         catClone.whoAm();
         cat1.whoAm();




         catClone = new Cat("Alex","Black",99);
         catClone.whoAm();
         cat1.whoAm();

         catClone = null;
//         catClone.whoAm();

        if (catClone != null){
            System.out.println(catClone.name);
            catClone.whoAm();

        }


    }
}
