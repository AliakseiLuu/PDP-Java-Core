package Task7;

public class Task7 {
    //Задача 7. Вывести элементы массива в обратном порядке;

    public static void main(String[] args) {

        byte[] arr = new byte[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;

        for (int i = arr.length-1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
