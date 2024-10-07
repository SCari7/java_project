package homework_07;
/*
Задача 1. Напишите программу расчета выдачи денег
 работнику с учётом надбавки за стаж,
 если базовая зарплата 500$.
  За 3 года работы надбавка 10%,
   за 5 лет работы надбавка 50%,
 за 10 лет работы надбавка 100%,
  за 15 лет работы надбавка 150%.
   Сколько лет проработал работник
   вводится с клавиатуры.
 */

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько лет ты работаешь: ");
        int years = scanner.nextInt();
        double salary = 500;
        double finalSalary = totalSalary(salary, years);

        System.out.println("Финальная зарплата: " + finalSalary);

    }

    public static double totalSalary(double salary, int yers){
        double bonus = 0;

        if (yers>= 3){
            bonus = 10;
        }else if (yers >= 5){
            bonus = 50;
        }else if (yers>= 10){
            bonus = 100;
        }else if (yers>= 15){
            bonus = 150;
        }
        return salary +(salary  * bonus / 100);

    }
}
