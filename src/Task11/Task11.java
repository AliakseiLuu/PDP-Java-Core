package Task11;
        //Написать код, который создаст, а затем отловит ArrayIndexOutOfBoundsException.

public class Task11 {

    public static void main (String[] args){
        int[] arr = {1,2,3,4,5};

        for(int i = 0; i < arr.length + 1; i++){
            try {
                arr[i] = i;
                System.out.println("Array index = " + arr[i]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array index = " + (arr[i-1] + 1) + " - Exceprion: Out of Bounds");
            }
        }
    }
}
