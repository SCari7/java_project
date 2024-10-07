package homework_04;

public class Method {
    public static void main(String[] args) {

double money = 300;
double britishPounds = convertEuroToBritishPounds(money);
        System.out.println("britishPounds: " + britishPounds);

        double money1 = 200;
        double ChineseYuan = convertEuroToChineseYuan(money1);
        System.out.println("Chinese Yuan: " + ChineseYuan);



    }

    private static double convertEuroToBritishPounds(double money){
        double rate = 1.19;
        return money / rate;
    }
    private static double convertEuroToChineseYuan(double money1){
        double rate = 0.13;
        return money1 / rate;
    }

}
