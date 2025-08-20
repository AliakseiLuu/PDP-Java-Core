import java.util.Scanner;

public class Main {
    //Задача 1. Написать метод который вычисляет факториал введенного целого числа
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввудите число для подсчета его факториала: ");
        int num = scanner.nextInt();

        int result = factorial(num);
        System.out.println("Факториал числа " + num + " равен: " + result);

    }

    public static int factorial(int num){

        int res = 1;
        for (int i = num; i > 0; i--){
            res *= i;
        }
        return res;
    }

}