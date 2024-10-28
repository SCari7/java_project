package homework_33.weekDay;

public class WeekDayAppl {
    public static void main(String[] args) {

        WeekDay d = WeekDay.SAN;
        System.out.println("Start day: " + d);

        int plus = 3;
        d = d.plusDay(plus);
        System.out.println("Plus: " + plus + " days: " + d);


    }
}
