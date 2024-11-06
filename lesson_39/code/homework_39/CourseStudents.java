package homework_39;

import java.util.HashSet;
import java.util.Set;

public class CourseStudents {
    public static void main(String[] args) {


// Создаем HashSet для студентов, записанных на курс "Математика"
        Set<String> mathStudents = new HashSet<>();
        mathStudents.add("Иван");
        mathStudents.add("Мария");
        mathStudents.add("Алексей");
        mathStudents.add("Сергей");

        // Создаем HashSet для студентов, записанных на курс "Информатика"
        Set<String> csStudents = new HashSet<>();
        csStudents.add("Мария");
        csStudents.add("Алексей");
        csStudents.add("Анна");
        csStudents.add("Петр");

        // Находим студентов, записанных на оба курса (пересечение множеств)

        Set<String> bothCourses = new HashSet<>(mathStudents);
        //Операция retainAll() используется для получения списка студентов, записанных на оба курса.
        bothCourses.retainAll(csStudents);

        // Находим студентов, записанных только на один из курсов (разность множеств)
        Set<String> onlyOneCourse = new HashSet<>(mathStudents);
        onlyOneCourse.addAll(csStudents);
        //Операция removeAll() помогает найти студентов, которые записаны только на один из курсов.
        onlyOneCourse.removeAll(bothCourses);

        // Выводим списки
        System.out.println("Студенты, записанные на оба курса: " + bothCourses);
        System.out.println("Студенты, записанные только на один из курсов: " + onlyOneCourse);




    }
}
