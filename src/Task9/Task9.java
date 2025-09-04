package Task9;

import java.util.Arrays;

public class Task9 {
    //Задача 9. Упорядочить и вывести числа в порядке возрастания (убывания) значений их длины.

    public static void main(String[] args) {

        int[] nums = new int[5];
        nums[0] = 121;
        nums[1] = 12345;
        nums[2] = 56988965;
        nums[3] = 365948;
        nums[4] = 1111122343;

// ****************Можно раскоммитить и будет работать через класс numLength********************
//        Arrays.sort(nums);
//
//        for (int i = 0; i < nums.length; i++){
//            int result = numLength(nums[i]);
//            System.out.println(result);
//        }

        System.out.println("Сортировка значений по возрастанию длинны числа: ");
        Arrays.sort(nums);

        for (int num : nums) {
            int stingNum = String.valueOf(num).length();
            System.out.println(stingNum);
        }

        System.out.println("\nСортировка значений по убыванию длинны числа: ");

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 0; i--){
            int stingNum = String.valueOf(nums[i]).length();
            System.out.println(stingNum);
        }
    }
// ****************Можно раскоммитить и будет работать через класс numLength********************
//    public static int numLength(int num){
//
//        int stingNum = String.valueOf(num).length(); //преобразовали num в строку
//
//        return stingNum;
//    }
}
