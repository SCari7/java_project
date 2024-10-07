package homework_18;

public class HouseAppl {
    public static void main(String[] args) {
//        Pet pet = new Pet(12345678,3,"cat", "Max");
        Cat cat = new Cat(44456723, 2,"cat", "Lili", "maineCoon", 0.40,6);
        System.out.println(cat);

        Dog dog = new Dog(22223334,2,"dog", "Oliv","spaniel", 0.50,6);
        System.out.println(dog);
        Pet[] pets = new Pet[5];
        pets[0] = new Dog(12345676,3,"dog","Max","Spitz", 0.36,3);
        pets[1] = new Dog(12345555,5,"dog","Gerda","Shepherd dog", 0.65,26);
        pets[2] = new Cat(12222233,7,"cat","Villi","sphinx", 0.30,2);
        pets[3] = new Cat(12344444,1,"cat","Flo","british", 0.30,3);
        pets[4] = new Cat(12345677,4,"cat","Li","siamese", 0.27,2);


        for (int i = 0; i < pets.length; i++) {
            pets[i].voice();

        }
    }





}
