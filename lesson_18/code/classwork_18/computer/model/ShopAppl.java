package classwork_18.computer.model;

public class ShopAppl {
    public static void main(String[] args) {

        Computer computer = new Computer("i7", 8,256, "Acer", 1200);
        System.out.println(computer);

        Laptop laptop = new Laptop("M2",8, 256,"Apple AirBook", 2200, 14, 1.5, 10, "blue");
        System.out.println(laptop);
        Smartphone smartphone = new Smartphone("MediaTek Helio G88",8,256,
                "Redmi",499,6.6,198.5,20,"green",
                234567987652L);
        System.out.println(smartphone);

        Computer[] computers = new Computer[6];
        computers[0] = new Computer("i7", 8,256, "Acer", 1200);
        computers[1] = new Computer("i5", 16,256, "Acer", 3500);
        computers[2] = new Computer("AMD", 8,256, "HP", 2000);
        computers[3] = new Laptop("Apple", 8,256, "MacBook", 2000,14,1.6,10,"white");
        computers[4] = new Laptop("Apple", 8,512, "MacBook Air", 3500,14.2,1.8,10,"white");

        computers[5] = new Smartphone("MediaTek Helio G88",8,256,
                "Redmi",499,6.6,198.5,20,"green",
                234567987652L);
//        Laptop[] laptops = new Laptop[3];

        double totalWeight = 0;
        for (int i = 0; i < computers.length; i++) { //,безопасный кастинг. превратили комп в лаптоп.и взяли вес
            if (computers[i] instanceof Laptop){
                Laptop myLaptop = (Laptop) computers[i];
                totalWeight += laptop.getWeight();
            }
//            totalWeight += computers[i].

        }
        System.out.println("Total weight: " + totalWeight);

        System.out.println("------------------------------------");

        int totalSsd = 0;
        for (int i = 0; i < computers.length; i++) {
            totalSsd += computers[i].getSsd();

        }
        System.out.println("Total ssd: " + totalSsd);

        double totalPrise = 0;
        for (int i = 0; i < computers.length; i++) {
            totalPrise += computers[i].getPrise();
        }

        System.out.println("Total prise: " + totalPrise);
        System.out.println("=================\n");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i]);

        }
        System.out.println("=================\n");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getBrand());

        }

    }
}
