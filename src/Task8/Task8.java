package Task8;

public class Task8 {
    //Задача 8. Среди чисел найти число-палиндром. Если таких чисел больше одного, найти второе.

    public static void main(String[] args) {

    int[] nums = new int[5];
        nums[0] = 121;
        nums[1] = 12345;
        nums[2] = 56988965;
        nums[3] = 365948;
        nums[4] = 1111122;

        for (int num : nums) {
            boolean result = reversed(num);
            if (result) {
                System.out.println("Число " + num + " палиндром ");
            }
        }
    }

    public static boolean reversed(int num){

        String stingNum = String.valueOf(num); //преобразовали num в строку

        String revers = new StringBuilder(stingNum).reverse().toString();  //сделали реверс строки stringNum

        return stingNum.equals(revers);   // сравнивает содержимое строк
    }
}
