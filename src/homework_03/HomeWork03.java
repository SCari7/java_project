package homework_03;

public class HomeWork03 {

    public static void main(String[] args) {

        short myAge = 27;
        System.out.println(myAge);

        double milkPrice = 0.99;
        System.out.println(milkPrice);

        String myName = "Karyna";
        System.out.println(myName);


// Task 2
        int var0 = 0;
        int var1 = 1;
        int var2 = 2;
        int var3 = 3;
        int result;

        result = var0 + var1 + var2 + var3 ;
        System.out.println("result: + " + result);
        int sumVar = result/ 4;
        System.out.println("sumVar " + sumVar);

// Task 3

        double priceA = 1000;
        double priceB = 500;
        double discount = 10;
        double sum = (priceA + priceB) * discount / 100;
        double sumWithDiscount = (priceA+priceB) - sum;
        System.out.println("сумма скидки : " + sum);
        System.out.println("сумма со скидкой : " + sumWithDiscount);


// Task 4

        int[] temperatures = { 23, 25, 22, 24, 26, 23, 25};
        int sum1 = 0;
        for (int temp : temperatures) {
            sum1 += temp ;
            int averageTemperature = sum1 / temperatures.length;
            System.out.println("средняя температура : " + averageTemperature + " °C");

            int mo = 18;
            int di = 20;
            int mi = 22;
            int don = 19;
            int fr = 21;
            int sam = 23;
            int so = 20;
            int days = 7;

            int sumTemp = mo + di + mi + don + fr + sam + so;
            System.out.println("sumTemp: " + sumTemp);


                    // todo
        }
    }
}

