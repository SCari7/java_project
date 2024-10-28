package classwork_33.seasons;

public class SeasonAppl {
    public static void main(String[] args) {
        // Season.values();

        Season[] seasons = Season.values();
        System.out.println("------------ values of Enum -------------");
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
            System.out.println(seasons[i].getNumber() + " : " + seasons[i].getName());
        }
        System.out.println("------------------------------------------------------");
        for (Season season : seasons) {
            System.out.println(season.getDuration());
            System.out.println(season.getName());
        }

        System.out.println("---------to String()----------");
        String str = Season.AUTUMN.toString();
        System.out.println(str);

        System.out.println("---------ordinal()----------");
        int num = Season.AUTUMN.ordinal();
        System.out.println(num);

        num = Season.SUMMER.ordinal();
        System.out.println(num);
        System.out.println("---------valueOf----------");
        Season season = Season.valueOf("SPRING");
        System.out.println(season);
        season = Season.valueOf("WINTER");
        System.out.println(season);


    }


}
