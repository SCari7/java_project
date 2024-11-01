package classwork_34.time_api_exercises;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class TimeAppl {
    public static void main(String[] args) {

        //How much time? - ISO format- сначала идет год, потом месяц, потом день. YYYY-mm-DD

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


        System.out.println("-----------------------------------");


        LocalDate gagarin = LocalDate.of(1961, 4, 12);//способ внесения даты в переменную
        System.out.println(gagarin);//ISO
        //какой это был день недели
        System.out.println(gagarin.getDayOfWeek());
        LocalDate myBird = LocalDate.of(1996, 12, 5);
        System.out.println(myBird);
        System.out.println(myBird.getDayOfWeek());
        System.out.println(myBird.getDayOfYear());

        System.out.println("-------------Is leap year---------------");
        int year = 2024;
        System.out.println("Is year: " + year + " leap " + Year.isLeap(year));
        System.out.println("-----------------------------------");
        System.out.println(myBird.isBefore(localDate));// true узнать была эта дата до или после определенной даты


        //можно выяснить сколь дней прошло от какой-либо даты

        long days = ChronoUnit.DAYS.between(myBird, localDate);
        System.out.println(days);
//также и с годами
        long years = ChronoUnit.YEARS.between(myBird, localDate);
        System.out.println(years);

        System.out.println("-------------DateTimeFormatter---------------");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;//YYYY-mm-DD
        String date = gagarin.format(dateTimeFormatter);//LocalDate to String
        System.out.println(date);

        //change format
        dateTimeFormatter = DateTimeFormatter.BASIC_ISO_DATE;
        date = gagarin.format(dateTimeFormatter);
        System.out.println(date);

        System.out.println("-------------DateTimeFormatter---------------");

        //задаем другой формат строки с датой
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = gagarin.format(dateTimeFormatter);
        System.out.println(date);



        System.out.println("-------------!!!!!!!!!!!!!!---------------");

        //задаем другой формат строки с датой
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        date = gagarin.format(dateTimeFormatter);
        System.out.println(date);


        System.out.println("-------------!!!!!!!!!!!!!!---------------");
// указываем локаль на каком языке и какой формат даты будет напечатан dd M yyyy, dd MM yyyy, dd MMM yyyy.
        dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.CHINA);
        date = gagarin.format(dateTimeFormatter);
        System.out.println(date);



        //вытащим дату из String называется parsing local date
        System.out.println("-------------!!!!!!!!!!!!!!---------------");
        String stringDate = "01/12/2024";
        LocalDate localDate1 = LocalDate.parse(stringDate, DateTimeFormatter.ofPattern
                ("[dd:MM:yyyy][dd/MM/yyyy][dd-MM-yyyy][dd:MM-yyyy]"));
        System.out.println(localDate1);// ISO формат получаем

        System.out.println("-------------!!!!!!!!!!!!!!---------------");
        String karinaBirthday = "05.12.1996";
        LocalDate karinaB = LocalDate.parse(karinaBirthday,DateTimeFormatter.ofPattern("[dd.MM.yyyy]"));
        System.out.println(karinaB);

        dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy",Locale.FRENCH);
       String d = karinaB.format(dateTimeFormatter);
        System.out.println(d);





    }


}
