package classwork_07;

public class Power {
    public static void main(String[] args) {
        int pow = (int) Math.pow(3, 10);

        int count = 0;// параметр цикла

        int res = 1;
        while (count < 10){
            res = res * 3;//возведение в степень
            count++;//изменение параметра цикла
            System.out.println(res + " = 3 in power " + count);

        }
    }
}
