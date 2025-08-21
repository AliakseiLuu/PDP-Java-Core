package Task2;

import java.util.Scanner;

public class Task2 {
    //Задача 2. Посчитать сумму цифр заданного числа
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввудите число для подсчета суммы его цифр: ");
        int num = scanner.nextInt();

        int result = summNum(num);
        System.out.println("Сумма цифр числа " + num + " равна: " + result);
    }

    public static int summNum(int num){

        String numArr = String.valueOf(num);
        int[] arroyOfNum = new int[numArr.length()];
        int res = 0;

        for (int i = 0; i < numArr.length(); i++) {
            arroyOfNum[i] = Character.getNumericValue(numArr.charAt(i));
            res += arroyOfNum[i];
        }
        return res;
    }

}
