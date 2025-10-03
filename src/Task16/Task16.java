package Task16;

//Дано три разных целых числа. Реализовать лямбда-выражение, которое находит наибольшее из этих трех чисел и выводит в консоль

public class Task16 {
    @FunctionalInterface
    interface TriConsumerInt {
        void accept(int a, int b, int c);
    }


        public static void main(String[] args) {

            TriConsumerInt printMax = (a, b, c) ->
                    System.out.println(Math.max(a, Math.max(b, c)));

            printMax.accept(4, 10, 25);
            printMax.accept(-10, 1, -50);
        }
    }
