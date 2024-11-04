package homework_38.weather;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TemperatureList {
    public static void main(String[] args) {

        List<DayTemperature> week1 = new ArrayList<>();
        List<DayTemperature> week2 = new ArrayList<>();


        week1.add(new DayTemperature(LocalDate.of(2024, 10, 25), 15.5));
        week1.add(new DayTemperature(LocalDate.of(2024, 10, 26), 14.2));
        week1.add(new DayTemperature(LocalDate.of(2024, 10, 27), 13.8));
        week1.add(new DayTemperature(LocalDate.of(2024, 10, 28), 12.5));
        week1.add(new DayTemperature(LocalDate.of(2024, 10, 29), 11.1));
        week1.add(new DayTemperature(LocalDate.of(2024, 10, 30), 10.7));
        week1.add(new DayTemperature(LocalDate.of(2024, 10, 31), 9.9));


        week2.add(new DayTemperature(LocalDate.of(2024, 11, 1), 8.6));
        week2.add(new DayTemperature(LocalDate.of(2024, 11, 2), 7.8));
        week2.add(new DayTemperature(LocalDate.of(2024, 11, 3), 9.0));
        week2.add(new DayTemperature(LocalDate.of(2024, 11, 4), 10.2));
        week2.add(new DayTemperature(LocalDate.of(2024, 11, 5), 11.5));
        week2.add(new DayTemperature(LocalDate.of(2024, 11, 6), 12.8));
        week2.add(new DayTemperature(LocalDate.of(2024, 11, 7), 13.3));

        // Объединение списков для анализа
        List<DayTemperature> allTemperatures = new ArrayList<>();
        allTemperatures.addAll(week1);
        allTemperatures.addAll(week2);

        // Расчет средней температуры
        double totalTemperature = 0;
        for (DayTemperature day : allTemperatures) {
            totalTemperature += day.getTemperature();
        }
        double averageTemperature = totalTemperature / allTemperatures.size();
        System.out.println("Средняя температура за две недели:" + averageTemperature);
        //TODO как сократить число в консоли до 2х знаков после точки типа  %.2f°C

        DayTemperature minTempDay = allTemperatures.get(0);
        for (DayTemperature day : allTemperatures) {
            if(day.getTemperature()< minTempDay.getTemperature());
            minTempDay = day;
        }
        System.out.println("День с минимальной температурой: " + minTempDay);


        // Поиск дня с максимальной температурой
        DayTemperature maxTempDay = allTemperatures.get(0);
        for (DayTemperature day : allTemperatures) {
            if (day.getTemperature() > maxTempDay.getTemperature()) {
                maxTempDay = day;
            }
        }
        System.out.println("День с максимальной температурой: " + maxTempDay);



    }



}
