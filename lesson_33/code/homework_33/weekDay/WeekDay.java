package homework_33.weekDay;

public enum WeekDay {
   MON("Monday",1),TUE("Tuesday",2),WED("Wednesday",3),
    THU("Thursday",4), FRI("Friday",5), SAT("Saturday",6),
    SAN("Sunday",7)
    ;
    private String title;
    private int day;

    WeekDay(String title, int day) {
        this.title = title;
        this.day = day;
    }

    public String getTitle() {
        return title;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeekDay{");
        sb.append("title='").append(title).append('\'');
        sb.append(", day=").append(day);
        sb.append('}');
        return sb.toString();
    }
    public WeekDay plusDay(int quantity){
        int d = this.ordinal();
        int index = d + quantity;
        WeekDay[] days = WeekDay.values();
        int res = index % days.length;
        return days[res];
    }



}
