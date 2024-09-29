package homework_03;

public class Task_4 {
    public static void main(String[] args) {
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
        double averageTemp = (double) sumTemp / days;
        System.out.println("averageTemp; " + averageTemp);

        // средняя температура 20,43
    }
}
