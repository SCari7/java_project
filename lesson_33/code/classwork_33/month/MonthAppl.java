package classwork_33.month;

public class MonthAppl {
    public static void main(String[] args) {
        Month m = Month.AUG;
        System.out.println("Start month " + m);

        int k = 29;

        m = m.plusMonth(k);
        System.out.println("After plusMonth " + k + " months: " + m);

    }
}
