package homework_19;

import java.util.Scanner;

public class MarketAppl {
    public static void main(String[] args) {
        Product product = new Product(12.25, "Cups", 123);
        //System.out.println(product);
        MeatFood meatFood = new MeatFood(9.99, "Beef", 2222, "12.12.2024", "Beef steak");
        //System.out.println(meatFood);
        MilkFood milkFood = new MilkFood(1.99, "Fresh Milk", 2345, "13.12.2024", "Milk", 3.5);
        //System.out.println(milkFood);
        Food food = new Food(2, "Bread", 1111, "14.12.2024");
        //System.out.println(food);


        Product[] products = new Product[4];
        products[0] = new Product(12.25, "Cups", 123);
        products[1] = new MeatFood(9.99, "Beef", 2222, "12.12.2024", "Beef steak");
        products[2] = new MilkFood(1.99, "Fresh Milk", 2345, "13.12.2024", "Milk", 3.5);
        products[3] = new Food(2, "Bread", 1111, "14.12.2024");

        printAllProducts(products);

        double totalPrise = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrise += products[i].getPrice();
        }
        System.out.println("Total prise: " + totalPrise);

        printNonFoodProducts(products);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bar code:  ");
        long enterBarCode = scanner.nextLong();

        Product foundProduct = findProductByBarCode(products, enterBarCode);

        if (foundProduct != null){
            System.out.println("Product: " + foundProduct);
        }else {
            System.out.println("Error: " + enterBarCode + " X!");
        }

        scanner.close();
    }
    public static Product findProductByBarCode(Product[] products, long barCode){
        for (int i = 0; i < products.length; i++) {
            if (products[i].getBarCode() == barCode){
                return products[i];
            }
        }return null;
    }

    public static void printAllProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);

        }
    }

    public static void printNonFoodProducts(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (!(products[i] instanceof Food)) {
                System.out.println("Not a food product: " + products[i] );
            }

        }
    }


}
