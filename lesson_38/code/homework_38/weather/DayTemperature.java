package homework_38.weather;

import java.time.LocalDate;

public class DayTemperature {
   private LocalDate date;
   private double temperature;

    public DayTemperature(LocalDate date, double temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("DayTemperature{");
//        sb.append("date=").append(date);
//        sb.append(", temperature=").append(temperature);
//        sb.append('}');
//        return sb.toString();
//    }

    @Override
    public String toString() {
        return String.format("%s: %.1f°C", date, temperature);
    }


}
