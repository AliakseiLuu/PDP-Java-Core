package Task6;

public class Task6 {
    //Задача 6. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void main(String[] args) {

        byte[] arr = new byte[12];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 11;
        arr[5] = 4;
        arr[6] = 5;
        arr[7] = 2;
        arr[8] = 4;
        arr[9] = 8;
        arr[10] = 9;
        arr[11] = 1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
        }
    }
}
