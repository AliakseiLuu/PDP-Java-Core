package Task15;

//Написать класс Студент с полями имя, возраст, AVG балл аттеста. Создать массив Студентов.
//   Выполнить сортировку:
//по оценке
//по имени
//Вывести на консоль студентов, у которых средний бал выше 8;

import java.util.Arrays;
import java.util.Comparator;

public class Task15 {

    public static void main(String[] args) {

        Students[] students = {
                new Students("Aliaksei", 21, 7.6f),
                new Students("Andry", 19, 8.1f),
                new Students("Igor", 20, 6.7f),
        };

        Arrays.sort(students, Comparator.comparing(Students::getName));

        for (Students i : students){
            System.out.println(i);
        }

        System.out.println("\n");

        Arrays.sort(students, Comparator.comparing(Students::getAVG));

        for (Students j : students){
            System.out.println(j);
        }

        System.out.println("\nAverage point more than 8 have following students: ");

        for(Students k : students){
            if (k.getAVG() > 8.0f){
            System.out.println(k);
            }
        }
    }
}





