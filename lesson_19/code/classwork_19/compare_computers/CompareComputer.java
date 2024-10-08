package classwork_19.compare_computers;


import classwork_18.computer.model.Computer;

public class CompareComputer {
    public static void main(String[] args) {
         ComputerBad c1 = new ComputerBad("i7",32,1024,"Hp",1500);

//        ComputerBad c1 = new ComputerBad("i3", 16, 256, "Aser", 1350);
        System.out.println(c1);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input CPU: ");
//        String cpu = scanner.nextLine();
//
//        System.out.println("Input RAM: ");
//        int ram = scanner.nextInt();
//
//        System.out.println("Input SSD: ");
//        int ssd = scanner.nextInt();
//        scanner.nextLine();
//
//
//        System.out.println("Input Brand: ");
//        String brand = scanner.nextLine();
//
//        System.out.println("Input Prise: ");
//        double prise = scanner.nextDouble();
//
//        //scanner.nextLine();
//
        Computer c2 = new Computer("i7",32,1024,"Hp",1500);
        System.out.println(c2);

        // boolean checker = (c1 == c2);
        // System.out.println(checker);

        boolean checker = c1.equals(c2);
        System.out.println(checker);


    }

}
