package classwork_03;

public class Math {
    public static void main(String[] args) {
        int x = 34;
        int y = 63;

        System.out.println(x + y);
        int res = x + y;

        System.out.println("x = " + x + " sum mit y = " + y + " result " + res);

//        int res1 = x - y;
        res = x - y;
        System.out.println("x = " + x+ " - y = " + y + " = " + res);

        res = y / x;
        System.out.println("y = " + y + " / x = " + x + " = " + res);
    }
}
