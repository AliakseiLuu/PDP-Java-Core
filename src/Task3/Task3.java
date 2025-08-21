package Task3;

import java.util.Scanner;

public class Task3 {
    //Задача 3. Написать программу вычисляющую площадь треугольника по трем сторонам

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну первой стороны треугольника: ");
        int a = scanner.nextInt();
        System.out.print("Введите длинну второй стороны треугольника: ");
        int b = scanner.nextInt();
        System.out.print("Введите длинну третьей стороны треугольника: ");
        int c = scanner.nextInt();

        double result = square(a, b, c);
        System.out.println("Плащадь треугольника abc равна: " + result);
    }

    public static double square(int a, int b, int c){

        int p = (a + b + c)/2;

        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
